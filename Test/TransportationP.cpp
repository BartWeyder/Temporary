#include "pch.h"
//#include "TransportationP.h"
//#include <algorithm>
//#include <cstdlib>
//#include <ctime>
//
//trp::Mat trp::north_west(ValVec needs, ValVec production)
//{
//	if (needs.sum() != production.sum()) throw std::logic_error("Not balanced");
//
//	Mat result(production.size(), Vec(needs.size(), 0.0));
//
//	 function to find available n-w element in result matrix
//	const auto find_nw = [](const Mat& m)
//	{
//		auto iterator = m.begin();
//		while(iterator != m.end())
//		{
//			auto it = std::find_if(iterator->begin(), iterator->end(), [](const double &v) { return v == 0.0; });
//			if (it != iterator->end())
//				return std::make_pair(std::distance(m.begin(), iterator), std::distance(iterator->begin(), it));
//			++iterator;
//		}
//		throw std::logic_error("Error in finding nw");
//	};
//
//	 check statement later
//	while (!(needs == 0.0).min() && !(production == 0.0).min())
//	{
//		const auto index = find_nw(result);
//		const auto val = std::min(production[index.first], needs[index.second]);
//		production[index.first] -= val;
//		needs[index.second] -= val;
//		result[index.first][index.second] = val;
//		 if prod is over than make elements of row unavailable 
//		if(production[index.first] == 0.0)
//		{
//			std::transform(result[index.first].begin(), result[index.first].end(), result[index.first].begin(),
//				[](const double &v)
//				{
//					if (v == 0) return -1.0; 
//					return v;
//				}
//			);
//		}
//		 if needs are over than make elements of column unavailable
//		if(needs[index.second] == 0.0)
//		{
//			for(auto i = result.begin(); i != result.end(); ++i)
//				(*i)[index.second] = ((*i)[index.second] == 0.0) ? -1.0 : (*i)[index.second];
//		}
//	}
//	return result;
//}
//
//trp::Mat trp::potential_method(const Mat & costs, Vec needs, Vec production)
//{
//	// get raw plan
//	auto result = north_west(ValVec(needs.data(), needs.size()), ValVec(production.data(), production.size()));
//	
//	// count basis elements
//	size_t basis_count = 0;
//	const auto basis_checker = [](const double &v) { return v >= 0; };
//	for (auto &i : result)
//		basis_count += std::count_if(i.begin(), i.end(), basis_checker);
//
//	// check for degeneracy
//	if (basis_count < needs.size() + production.size() - 1)
//	{
//		// TODO: logic to prevent degeneracy 
//		auto difference = needs.size() + production.size() - 1 - basis_count;
//		// adding basis elements
//		for (auto &i : result)
//		{
//			auto it = std::find_if_not(
//				std::find_if(i.begin(), i.end(), basis_checker), i.end(), basis_checker);
//			if (it != i.end())
//			{
//				*it = 0.0;
//				if (--difference == 0) break;
//			}
//		}
//	}
//
//	// declaring needed functions and vars for calculation of potentials
//	// u + v = c
//	Vec u_potential(production.size()), v_potential(needs.size());
//	BMat status(production.size(), BVec(needs.size(), false)); 
//	
//	auto calc_potential_vertical = [](std::pair<size_t, size_t> current,
//		const Mat &costs, Vec &u, Vec &v, BMat &status)
//	{
//		
//	};
//
//	auto calc_potential_horizontal = [](std::pair<size_t, size_t> current,
//		const Mat &costs, Vec &u, Vec &v, BMat &status)
//	{
//
//	};
//
//	
//
//	return Mat();
//}
