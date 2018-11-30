#include "pch.h"
#include "TransportationProblem.h"
#include <algorithm>
#include <numeric>

TransportationProblem::Mat TransportationProblem::northWest(ValVec production, ValVec needs)
{
	if (needs.sum() != production.sum()) throw std::logic_error("Not balanced");

	Mat result(production.size(), Vec(needs.size(), 0.0));

	// function to find available n-w element in result matrix
	const auto find_nw = [](const Mat& m)
	{
		auto iterator = m.begin();
		while (iterator != m.end())
		{
			auto it = std::find_if(iterator->begin(), iterator->end(),
				[](const double& v) { return v == 0.0; });
			if (it != iterator->end())
				return std::make_pair(std::distance(m.begin(), iterator),
					std::distance(iterator->begin(), it));
			++iterator;
		}
	};

	// check statement later
	while (!(needs == 0.0).min() && !(production == 0.0).min())
	{
		const auto index = find_nw(result);
		const auto val = std::min(production[index.first], needs[index.second]);
		production[index.first] -= val;
		needs[index.second] -= val;
		result[index.first][index.second] = val;
		// if prod is over than make elements of row unavailable 
		if (production[index.first] == 0.0)
		{
			std::transform(result[index.first].begin(), result[index.first].end(),
				result[index.first].begin(),
				[](const double &v)
			{
				if (v == 0) return -1.0;
				return v;
			}
			);
		}
		// if needs are over than make elements of column unavailable
		if (needs[index.second] == 0.0)
		{
			for (auto i = result.begin(); i != result.end(); ++i)
				(*i)[index.second] = ((*i)[index.second] == 0.0) ? -1.0 : (*i)[index.second];
		}
	}
	return result;
}

TransportationProblem::Mat TransportationProblem::potentialMethod(
	const Mat& costs, Vec production, Vec needs)
{
	// get raw plan
	auto result = northWest(ValVec(production.data(), production.size()),
	                        ValVec(needs.data(), needs.size()));


	// start of iteration part of algorithm
	while (true)
	{
		if (isDistributionCorrect(result, production, needs))
			throw std::logic_error("Error: incorrect distribution");
		
		// count basis elements
		auto basis_count = 0;
		//const auto basis_checker = [](const double &v) { return v >= 0; };
		for (auto &i : result)
			basis_count += std::count_if(i.begin(), i.end(), basisChecker);

		// check for degeneracy
		if (basis_count < needs.size() + production.size() - 1)
		{
			// logic to prevent degeneracy 
			auto difference = needs.size() + production.size() - 1 - basis_count;
			// adding basis elements
			for (auto &i : result)
			{
				auto it = std::find_if_not(
					std::find_if(i.begin(), i.end(), basisChecker), i.end(), basisChecker);
				if (it != i.end())
				{
					*it = 0.0;
					if (--difference == 0) break;
				}
			}
		}

		// calc potentials
		auto potentials = calcPotentials(costs, result);

		// calculate deltas
		Mat deltas(costs.size(), Vec(needs.size()));
		for (auto i = 0; i < deltas.size(); ++i)
		{
			for (auto j = 0; j < needs.size(); ++j)
			{
				deltas[i][j] = costs[i][j] - potentials.first[i] - potentials.second[j];
			}
		}
		// check if optimal
		const auto problem = optimalCheck(deltas);
		if (problem.first < 0)
			return result;

		auto loop = findLoop(problem, result);
		loopRedistribute(loop, result);
	}
}


void TransportationProblem::calcPotentialVertical(std::pair<size_t, size_t> current,
	const Mat &costs, const Mat& plan, Vec &u, Vec &v, BMat &status)
{
	for (auto i = 0; i < plan.size(); ++i)
	{
		if (basisChecker(plan[i][current.second]) && !status[i][current.second])
		{
			u[i] = costs[i][current.second] - v[current.second];
			status[i][current.second] = true;
			calcPotentialHorizontal({ i, current.second }, costs, plan, u, v, status);
		}
	}
}

void TransportationProblem::calcPotentialHorizontal(std::pair<size_t, size_t> current,
	const Mat &costs, const Mat& plan, Vec &u, Vec &v, BMat &status)
{
	for (auto j = 0; j < v.size(); ++j)
	{
		if (basisChecker(plan[current.first][j]) && !status[current.first][j])
		{
			v[j] = costs[current.first][j] - u[current.first];
			status[current.first][j] = true;
			calcPotentialVertical({ current.first, j }, costs, plan, u, v, status);
		}
	}
}

std::pair<TransportationProblem::Vec, TransportationProblem::Vec> TransportationProblem::calcPotentials(
	const Mat& costs, const Mat& plan)
{
	// u + v = c
	Vec u(costs.size()), v(costs.begin()->size());
	BMat status(u.size(), BVec(v.size(), false));

	calcPotentialHorizontal({ 0,0 }, costs, plan, u, v, status);
	calcPotentialVertical({ 0,0 }, costs, plan, u, v, status);

	return std::make_pair(u, v);
}

double TransportationProblem::calcFunctionValue(const Mat& costs, const Mat& plan)
{
	auto value = 0.0;
	for (auto i = 0; i < plan.size(); ++i)
		for (auto j = 0; j < plan.begin()->size(); ++j)
			if (basisChecker(plan[i][j]))
				value += plan[i][j] * costs[i][j];

	return value;
}

std::pair<int, int> TransportationProblem::optimalCheck(const Mat & delta)
{
	auto res = std::make_pair(-1, -1);
	auto min = 0.0;
	for (auto i = delta.begin(); i != delta.end(); ++i)
	{
		auto it = std::min_element(i->begin(), i->end());
		if (*it < min)
		{
			min = *it;
			res.first = std::distance(delta.begin(), i);
			res.second = std::distance(i->begin(), it);
		}
	}
	return res;
}

bool TransportationProblem::lookVertical(std::list<std::pair<int, int>>& l, const Mat& plan)
{
	const auto el = *(l.rbegin());
	auto copy = l;

	if (el.second == l.begin()->second && el != *l.begin()) return true;

	auto index = el.first - 1;
	while (index >= 0)
	{
		if (basisChecker(plan[index][el.second]))
		{
			const auto next = std::find(l.begin(), l.end(), std::make_pair(index, el.second));
			if (next == l.end())
			{
				copy.push_back(std::make_pair(index, el.second));
				if (lookHorizontal(copy, plan))
				{
					std::swap(l, copy);
					return true;
				}
				copy.pop_back();
			}
		}
		--index;
	}

	copy = l;
	index = el.first + 1;
	while (index < plan.size())
	{
		if (basisChecker(plan[index][el.second]))
		{
			const auto next = std::find(l.begin(), l.end(), std::make_pair(index, el.second));
			if (next == l.end())
			{
				copy.push_back(std::make_pair(index, el.second));
				if (lookHorizontal(copy, plan))
				{
					std::swap(l, copy);
					return true;
				}
				copy.pop_back();
			}
		}
		++index;
	}
	return false;
}

bool TransportationProblem::lookHorizontal(std::list<std::pair<int, int>>& l, const Mat& plan)
{
	const auto el = *(l.rbegin());
	auto copy = l;

	if (el.first == l.begin()->first && el != *l.begin()) return true;

	auto index = el.second - 1;
	while (index >= 0)
	{
		if (basisChecker(plan[el.first][index]))
		{
			const auto next = std::find(l.begin(), l.end(), std::make_pair(el.first, index));
			if (next == l.end())
			{
				copy.push_back(std::make_pair(el.first, index));
				if (lookVertical(copy, plan))
				{
					std::swap(l, copy);
					return true;
				}
				copy.pop_back();
			}
		}
		--index;
	}

	copy = l;
	index = el.first + 1;
	while (index < plan.begin()->size())
	{
		if (basisChecker(plan[el.first][index]))
		{
			const auto next = std::find(l.begin(), l.end(), std::make_pair(el.first, index));
			if (next == l.end())
			{
				copy.push_back(std::make_pair(el.first, index));
				if (lookVertical(copy, plan))
				{
					std::swap(l, copy);
					return true;
				}
				copy.pop_back();
			}
		}
		++index;
	}
	return false;
}

void TransportationProblem::loopRedistribute(const std::list<std::pair<int, int>>& loop, Mat & plan)
{
	auto min = *(++loop.begin());
	auto min_value = plan[min.first][min.second];
	auto i = loop.begin();
	for (std::advance(i, 3); i != loop.end(); ++i)
	{
		if (plan[i->first][i->second] < min_value)
		{
			min = *i;
			min_value = plan[i->first][i->second];
		}
		++i;
		if (i == loop.end())
			break;
	}
	// add new value in start postition
	i = loop.begin();
	plan[i->first][i->second] = min_value;
	// deleting min distribution from plan
	plan[min.first][min.second] -= 1;
	++i;
	// add and subtract value
	auto multiplier = -1;
	for (; i != loop.end(); ++i)
	{
		plan[i->first][i->second] += min_value * multiplier;
		multiplier *= -1;
	}
}

bool TransportationProblem::isDistributionCorrect(const Mat& result,
                                                  const Vec& production, const Vec& needs)
{
	auto n_check = Vec(needs.size()), p_check = Vec(production.size());
	for (auto i = 0; i < production.size(); ++i)
	{
		p_check[i] = std::accumulate(result[i].begin(), result[i].end(), 0.0);
		for (auto j = 0; j < needs.size(); ++j)
			n_check[j] += result[i][j];
	}
	return production == p_check && needs == n_check;
}

std::list<std::pair<int, int>> TransportationProblem::findLoop(
	const std::pair<int, int> start, const Mat& plan)
{
	std::list<std::pair<int, int>> list{ start };
	if (lookHorizontal(list, plan) || lookVertical(list, plan))
		return list;
	throw std::logic_error("Can't find loop");
}
