#pragma once
#include <vector>
#include <functional>
#include <algorithm>
#include <valarray>
#include "NelderMeadParams.h"

std::valarray<double> nelder_mead(std::function<double(std::valarray<double>)> f,
	std::valarray<double> startPoint, NelderMeadParams params = NelderMeadParams());

std::vector<std::valarray<double>> make_polyhedron(std::valarray<double> startPoint, double h = 5);