#pragma once
#include <vector>
#include <valarray>

namespace trp
{
	typedef std::vector<std::vector<double>> Mat;
	typedef std::vector<double> Vec;
	typedef std::valarray<double> ValVec;

	Mat north_west(ValVec needs, ValVec production);

}
