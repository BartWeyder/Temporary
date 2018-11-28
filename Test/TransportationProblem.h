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

	static Mat northWest(ValVec needs, ValVec production);
	static Mat potentialMethod(const Mat& costs, Vec needs, Vec production);
	static std::list<std::pair<int, int>> findLoop(std::pair<int, int> start, const Mat& plan);
	static std::pair<Vec, Vec> calcPotentials(const Mat &costs, const Mat& plan);

private:
	static bool basisChecker(const double &v) { return v >= 0.0; }
	static void calcPotentialVertical(std::pair<size_t, size_t> current,
		const Mat &costs, const Mat& plan, Vec &u, Vec &v, BMat &status);
	static void calcPotentialHorizontal(std::pair<size_t, size_t> current,
		const Mat &costs, const Mat& plan, Vec &u, Vec &v, BMat &status);
	// Return: pair of vectors: u(vertical) and v(horizontal)
	static std::pair<int, int> optimalCheck(const Mat &delta);
	static bool lookVertical(std::list<std::pair<int, int>> & l, const Mat& plan);
	static bool lookHorizontal(std::list<std::pair<int, int>> & l, const Mat& plan);
public:
	static void loopRedistribute(const std::list<std::pair<int, int>>& loop, Mat& plan);
};

