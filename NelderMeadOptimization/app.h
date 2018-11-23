#pragma once
#include <valarray>

class App
{
	std::valarray<double> answer_ = {};
	static double f(std::valarray<double> arg);

public:
	App() = default;
	void launch();
	void pointInput();

	std::valarray<double> start_point;
};
