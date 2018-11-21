#pragma once

#include <array>

struct NelderMeadParams
{
	double alpha = 1, beta = 0.5, gamma = 2;
	std::array<size_t, 6> kod;
	std::array<double, 6> est;

	explicit NelderMeadParams(const double alpha = 1, const double beta = 0.5, const double gamma = 2,
		std::array<size_t, 6> kod = {5, 1, 10, 1000, 100, 0}, 
		std::array<double, 6> est = {-1, 0.1, 1, 0.001, 1, 0.05});
};
