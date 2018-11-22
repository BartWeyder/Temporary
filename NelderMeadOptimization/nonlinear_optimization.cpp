#include  "pch.h"
#include "nonlinear_optimization.hpp"
#include <iostream>

template<class T>
struct Greater
{
private:
	std::function<T(std::valarray<T>)> f_;
public:
	explicit Greater(std::function<T(std::valarray<T>)> f) : f_(f) {}
	bool operator()(std::valarray<T> const &a, std::valarray<T> const &b) const
	{
		return f_(a) > f_(b);
	}
};

std::valarray<double> nelder_mead(std::function<double(std::valarray<double>)> f,
	const std::valarray<double> startPoint, NelderMeadParams params)
{
	//vector to store temp double values
	std::valarray<double> tmp(startPoint.size() + 1);
	// part 1: creating polyhedron
	auto polyhedron_peaks = make_polyhedron(startPoint, params.est[1]);
	// part 2: 
	const Greater<double> cmp(f);


	// iterations; checking for left resources
	while (params.kod[3] > 0 && params.kod[4] > 0)
	{
		// decrementing iteration value
		params.kod[4]--;

		//sorting thing
		std::sort(polyhedron_peaks.begin(), polyhedron_peaks.end(), cmp);
		auto highest = std::make_pair(polyhedron_peaks.begin(), f(polyhedron_peaks[0]));
		auto middle = std::make_pair(polyhedron_peaks.begin() + 1, f(*(polyhedron_peaks.begin() + 1)));
		auto lowest = std::make_pair(polyhedron_peaks.rbegin(), f(*polyhedron_peaks.rbegin()));

		auto xc = std::valarray<double>(0.0, highest.first->size());

		for (auto i = polyhedron_peaks.begin() + 1; i != polyhedron_peaks.end(); ++i)
			xc += *i;
		xc /= static_cast<double>(xc.size());

		// additional check condition
		for (auto j = 0; j < polyhedron_peaks.size(); ++j)
			tmp[j] = std::pow(polyhedron_peaks[j] - xc, 2.0).sum();
		if (tmp.sum() < params.dm * params.dm * tmp.size())
			break;

		auto r = std::make_pair(
			(1 + params.alpha) * xc - params.alpha * (*highest.first),
			f((1 + params.alpha) * xc - params.alpha * (*highest.first))
		);
		// decrementing function calculations: for highest, middle, lowest and r
		params.kod[3] -= 4;

		if (r.second < lowest.second)
		{
			// stretching
			const auto e = std::make_pair(
				(1 - params.gamma) * xc + params.gamma * r.first,
				f((1 - params.gamma) * xc + params.gamma * r.first)
			);
			params.kod[3]--;

			if (e.second < r.second)
			{
				*highest.first = e.first;
				highest.second = e.second;
			}
			if (r.second < e.second)
			{
				*highest.first = r.first;
				highest.second = r.second;
			}
			continue;
		}
		if (lowest.second < r.second && r.second < middle.second)
		{
			*highest.first = r.first;
			highest.second = r.second;
			continue;
		}
		if (middle.second < r.second && r.second < highest.second)
		{
			std::swap(r.first, *highest.first);
			std::swap(r.second, highest.second);
		}

		// contract part
		auto s = std::make_pair(
			params.beta * (*highest.first) + (1 - params.beta) * xc,
			f(params.beta * (*highest.first) + (1 - params.beta) * xc)
		);
		params.kod[3]--;

		if (s.second < highest.second)
		{
			*highest.first = s.first;
			highest.second = s.second;
			continue;
		}
		if (s.second >= highest.second)
			for (auto i = polyhedron_peaks.begin(); i != polyhedron_peaks.end() - 1; ++i)
			{
				*i = *lowest.first + (*i - *lowest.first) / 2.0;
			}
	}

	std::sort(polyhedron_peaks.begin(), polyhedron_peaks.end(), cmp);
	std::cout << "Function calls left: " << params.kod[3] << std::endl << "Iterations left: " <<
		params.kod[4] << std::endl;
	return *polyhedron_peaks.rbegin();
}

std::vector<std::valarray<double>> make_polyhedron(const std::valarray<double> startPoint, const double h)
{
	if (startPoint.size() < 1) throw std::logic_error("point must be initialized");

	std::vector<std::valarray<double>> result;
	const auto size = startPoint.size() + 1;
	result.reserve(size);
	result.push_back(startPoint);
	auto point = startPoint;

	for (size_t i = 1; i < size; ++i)
	{
		for (size_t j = 0; j < result.size() - 1; ++j)
			point += result[j];
		point /= static_cast<double>(result.size());
		point[i - 1] += h;
		result.push_back(point);
	}

	return result;
}
