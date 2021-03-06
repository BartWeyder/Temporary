#pragma once
#include <vector>
#include <valarray>
#include <list>

class TransportationProblem
{
public:
	typedef std::vector<std::vector<double>> Mat;
	typedef std::vector<double> Vec;
	typedef std::valarray<double> ValVec;
	typedef std::vector<bool> BVec;
	typedef std::vector<std::vector<bool>> BMat;

	static Mat northWest(ValVec production, ValVec needs);
	static Mat potentialMethod(const Mat& costs, Vec production, Vec needs);
	static std::list<std::pair<int, int>> findLoop(std::pair<int, int> start, const Mat& plan);
	// Return: pair of vectors: u(vertical) and v(horizontal)
	static std::pair<Vec, Vec> calcPotentials(const Mat &costs, const Mat& plan);
	static double calcFunctionValue(const Mat& costs, const Mat& plan);

private:
	static bool basisChecker(const double &v) { return v >= 0.0; }
	static void calcPotentialVertical(std::pair<size_t, size_t> current,
		const Mat &costs, const Mat& plan, Vec &u, Vec &v, BMat &status);
	static void calcPotentialHorizontal(std::pair<size_t, size_t> current,
		const Mat &costs, const Mat& plan, Vec &u, Vec &v, BMat &status);
	static std::pair<int, int> optimalCheck(const Mat &delta);
	static bool lookVertical(std::list<std::pair<int, int>> & l, const Mat& plan);
	static bool lookHorizontal(std::list<std::pair<int, int>> & l, const Mat& plan);
	static void loopRedistribute(const std::list<std::pair<int, int>>& loop, Mat& plan);
	static bool isDistributionCorrect(const Mat& result, const Vec& production, const Vec& needs);
};

