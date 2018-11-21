// NelderMeadOptimization.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "nonlinear_optimization.hpp"


int main()
{
	auto res = make_polyhedron({ 1, 1, 1 });
	for(auto &i :res)
	{
		for (auto &j : i)
			std::cout << j << ' ';
		std::cout << std::endl;
	}
    //std::cout << "Hello World!\n"; 
}
