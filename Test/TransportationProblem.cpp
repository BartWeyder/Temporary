#include "pch.h"
#include "TransportationProblem.h"
#include <algorithm>

trp::Mat trp::north_west(ValVec needs, ValVec production)
{
	if (needs.sum() != production.sum()) throw std::logic_error("Not balanced");

	Mat result(production.size(), Vec(needs.size(), -1.0));

	// function to find available n-w element in result matrix
	const auto find_nw = [](const Mat& m)
	{
		auto iterator = m.begin();
		while(iterator != m.end())
		{
			auto it = std::find_if(iterator->begin(), iterator->end(), [](const double &v) { return v < 0; });
			if (it != iterator->end())
				return std::make_pair(std::distance(m.begin(), iterator), std::distance(iterator->begin(), it));
			++iterator;
		}
		throw std::logic_error("Error in finding nw");
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
		if(production[index.first] == 0.0)
		{
			std::transform(result[index.first].begin(), result[index.first].end(), result[index.first].begin(),
				[](const double &v)
				{
					if (v < 0) return 0.0; 
					return v;
				}
			);
		}
		// if needs are over than make elements of column unavailable
		if(needs[index.second] == 0.0)
		{
			for(auto i = result.begin(); i != result.end(); ++i)
				(*i)[index.second] = ((*i)[index.second] < 0.0) ? 0.0 : (*i)[index.second];
		}
	}
	return result;
}
