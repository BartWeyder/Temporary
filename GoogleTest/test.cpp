#include "pch.h"
#include "../NelderMeadOptimization/nonlinear_optimization.cpp"
#include "../NelderMeadOptimization/NelderMeadParams.cpp"

TEST(Polyhedron, PolyhedronCreation) {
	std::vector<std::valarray<double>> oracle = {
			  {1, 2, 3, 4},
			  {1.5, 2, 3, 4},
			  {1.25, 2.5, 3, 4},
			  {1.25, 2.16667, 3.5, 4},
			  {1.25, 2.16667, 3.125, 4.5}
	};

	auto tester = make_polyhedron({ 1, 2, 3, 4 }, 0.5);

	const std::valarray<double> diff = { 0.0001, 0.0001, 0.0001, 0.0001 };

	auto b = tester.begin();
	auto same = true;
	for (auto &i : oracle)
	{
	  same = ((*b - i) <= diff).min();
	  //std::cout << "!!!!!!!!!!!!!!!!!!!!" << same << std::endl;
	  if (!same) break;
	  ++b;
	}
	EXPECT_TRUE(same);
}

TEST(Polyhedron, PolyhedronCreationFailure) {
	auto failed = false;
	try
	{
		auto tester = make_polyhedron({}, 0.5);
	}
	catch (std::logic_error)
	{
		failed = true;
	}
	EXPECT_TRUE(failed);
}

TEST(NelderMeadCore, checkResult) {
	
	auto f = [](std::valarray<double> arg)
	{
		return arg[0] * arg[0] + arg[1] * arg[1] + 2 * arg[2] * arg[2] + 2 * arg[3] * arg[3] +
			16 * arg[0] * arg[0] * arg[1] * arg[1] + 8 * arg[1] * arg[1] * arg[2] * arg[2] + 2;
	};
	const auto result = nelder_mead(f, { 1,2,3,4 });
	const std::valarray<double> diff = { 0.0001, 0.0001, 0.0001, 0.0001 };
	const std::valarray<double> oracle = { 0.0, 0.0, 0.0, 0.0 };
	auto b = (std::abs(result - oracle) < diff).min();
	EXPECT_TRUE(b);
}

TEST(NelderMeadCore, checkResult2) {

	auto f = [](std::valarray<double> arg)
	{
		/*if (arg[0]* arg[0] + arg[1]* arg[1] >= 3)
			return  10;*/
		if (arg[0] * arg[0] + arg[1] * arg[1] >= 1)
			return 10.0;
		return arg[0] * arg[0] + arg[1] * arg[1];

	};
	const auto result = nelder_mead(f, { -2,-2 }, 
		NelderMeadParams(1, 0.5, 2, { 5, 1, 10, 10000, 1000, 0 }, 
			{ -1, 4, 1, 0.001, 1, 0.05 }));
	const std::valarray<double> diff = { 0.0001, 0.0001 };
	const std::valarray<double> oracle = { 0.0, 0.0 };
	auto b = (std::abs(result - oracle) < diff).min();
	EXPECT_TRUE(b);
}
