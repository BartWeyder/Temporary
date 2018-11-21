// NelderMeadOptimization.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "nonlinear_optimization.hpp"

auto f(std::valarray<double> arg)
{
	return arg[0] * arg[0] + arg[1] * arg[1] + 2 * arg[2] * arg[2] + 2 * arg[3] * arg[3] +
		16 * arg[0] * arg[0] * arg[1] * arg[1] + 8 * arg[1] * arg[1] * arg[2] * arg[2] + 2;
}

int main()
{
	/*auto res = make_polyhedron({ 1, 1, 1 });
	for(auto &i :res)
	{
		for (auto &j : i)
			std::cout << j << ' ';
		std::cout << std::endl;
	}*/

	auto answer = nelder_mead(f, { 1, 2, 3, 4 });
	for (auto &i : answer)
		std::cout << i << ' ';
    //std::cout << "Hello World!\n"; 
}
