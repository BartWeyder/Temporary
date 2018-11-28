// Test.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "TransportationProblem.h"


int main()
{
	/*auto&& res = TransportationProblem::northWest({ 20,30,30,10 }, { 30,40,20 });
	auto loop = TransportationProblem::findLoop({ 1,3 }, res);*/
	/*for (auto &i : res)
	{
		for (auto &j : i)
			std::cout << j << ' ';
		std::cout << std::endl;
	}*/
	/*for (auto &j : loop)
		std::cout << '[' << j.first << ',' << j.second << "] ";
	auto potentials = TransportationProblem::calcPotentials({ {2,3,2,4},{3,2,5,1},{4,3,2,6} },
		{ {20,10,-1,-1},{-1,20,20,-1},{-1,-1,10,10} });*/
	auto result = TransportationProblem::potentialMethod(
		{ { 25, 28, 20, 15, 7}, {27,5,11,23,10}, {1,25,14,16,16}, {8,6,4,16,18} },
		{ 16,12,14,18 }, { 7,8,4,11,30 });

	for (auto vector : result)
	{
		for (auto value : vector)
			std::cout << value << ' ';
		std::cout << std::endl;
	}
}