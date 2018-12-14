// Test.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "AStar.hpp"
#include <complex>


int main()
{
	AStar::Generator generator;
	// Set 2d map size.
	generator.setWorldSize({ 25, 25 });
	// You can use a few heuristics : manhattan, euclidean or octagonal.
	generator.setHeuristic(AStar::Heuristic::euclidean);
	generator.setDiagonalMovement(true);
	

	std::cout << "Generate path ... \n";
	// This method returns vector of coordinates from target to source.
	auto path = generator.findPath({ 0, 0 }, { 20, 20 });

	for (auto& coordinate : path) {
		std::cout << coordinate.x << " " << coordinate.y << "\n";
	}
}
