// Test.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "TransportationProblem.h"


int main()
{
	/*const TransportationProblem::Mat costs{
		{25, 28, 20, 15, 7}, {27, 5, 11, 23, 10}, {1, 25, 14, 16, 16}, {8, 6, 4, 16, 18}
	};
	auto result = TransportationProblem::potentialMethod(
		costs,
		{ 16,12,14,18 }, { 7,8,4,11,30 });*/

	const TransportationProblem::Mat costs{
		{10,20,5,15}, {7,8,5,23}, {7,7,36,6} };
	auto result = TransportationProblem::potentialMethod(
		costs,
		{60, 30 ,40}, {40, 50, 10, 30}
	);

	for (auto vector : result)
	{
		for (auto value : vector)
			std::cout << value << ' ';
		std::cout << std::endl;
	}
	std::cout << "F = " << TransportationProblem::calcFunctionValue(costs, result);

}