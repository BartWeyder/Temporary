#include "pch.h"
#include "../Test/TransportationProblem.cpp"

const TransportationProblem::Mat costs{
		{25, 28, 20, 15, 7}, {27, 5, 11, 23, 10}, {1, 25, 14, 16, 16}, {8, 6, 4, 16, 18}
};

TEST(TransportationP, CheckOptimalFunctionValue) {
	
	const auto result = TransportationProblem::potentialMethod(
		costs,
		{ 16,12,14,18 }, { 7,8,4,11,30 });

	EXPECT_EQ(511, TransportationProblem::calcFunctionValue(costs, result));
}

TEST(TransportationP, CheckPlanEquality)
{
	const auto result = TransportationProblem::potentialMethod(
		costs,
		{ 16,12,14,18 }, { 7,8,4,11,30 });
	TransportationProblem::Mat oracle = {
		{-1, -1, -1, -1, 16}, {-1, -1, -1, -1, 12}, {7, -1, -1, 5, 2}, {-1, 8, 4, 6, -1}
	};
	EXPECT_EQ(result, oracle);

}

TEST(TransportationP, DegeneracyTest)
{
	const TransportationProblem::Mat costs_{
		{10,20,5,15}, {7,8,5,23}, {7,7,36,6} };
	const auto result = TransportationProblem::potentialMethod(
		costs_,
		{ 60, 30 ,40 }, { 40, 50, 10, 30 }
	);
	EXPECT_EQ(1100, TransportationProblem::calcFunctionValue(costs_, result));
}

TEST(TransportationP, NWFail)
{
	EXPECT_THROW(TransportationProblem::northWest({-1,-1,-1}, {-1,-1,-1,-1}),
		std::logic_error);
}

TEST(TransportationP, distribFail)
{
	EXPECT_THROW(TransportationProblem::potentialMethod({ {0,0,0,0,0}, { 0,0,0,0,0 },
		{ 0,0,0,0,0 }, { 0,0,0,0,0 } }, { 0,0,0,0 }, { 0,0,0,0,0 }), std::logic_error);
}

TEST(TransportationP, loopFail)
{
	EXPECT_THROW(TransportationProblem::findLoop({ 0,0 }, { {-1,-1,-1},{-1,-1,-1},
		{-1,-1,-1} }), std::logic_error);
}