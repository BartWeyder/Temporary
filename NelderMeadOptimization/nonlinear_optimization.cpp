#include  "pch.h"
#include "nonlinear_optimization.hpp"

template<class T>
struct Greater
{
private:
	std::function<T(std::vector<std::valarray<T>>)> f_;
public:
	explicit Greater(std::function<T(std::valarray<T>)> f) : f_(f) {}
	bool operator()(std::valarray<T> const &a, std::valarray<T> const &b) const
	{
		return f_(a) > f_(b);
	}
};

std::valarray<double> nelder_mead(std::function<double(std::valarray<double>)> f,
                                  const std::valarray<double> startPoint, NelderMeadParams params)
{
	// part 1: creating polyhedron
	auto polyhedron_peaks = make_polyhedron(startPoint, params.est[1]);
	// part 2: 
	const Greater<double> cmp(f);
	std::sort(polyhedron_peaks.begin(), polyhedron_peaks.end(), cmp);
	auto highest = std::make_pair(polyhedron_peaks[0], f(polyhedron_peaks[0]));
	auto middle = std::make_pair(polyhedron_peaks[1], f(polyhedron_peaks[1]));
	auto lowest = std::make_pair(*polyhedron_peaks.rbegin(), f(*polyhedron_peaks.rbegin()));

	auto xc = std::valarray<double>(0.0, highest.first.size());

	for (auto i = polyhedron_peaks.begin() + 1; i != polyhedron_peaks.end(); ++i)
		xc += *i;
	xc /= xc.size();

	// reflection part
	auto xr = (1 + params.alpha) * xc - params.alpha * highest.first;
	auto point_r = std::make_pair(xr, f(xr));

	// TODO: compare results part

	// ...

	// TODO: implement return
	return {};
}

std::vector<std::valarray<double>> make_polyhedron(const std::valarray<double> startPoint, const double h)
{
	if (startPoint.size() < 1) throw std::logic_error("point must be initialized");

	std::vector<std::valarray<double>> result;
	const auto size = startPoint.size() + 1;
	result.reserve(size);
	result.push_back(startPoint);
	auto point = startPoint;

	for (size_t i = 1; i < size; ++i)
	{
		for (size_t j = 0; j < result.size() - 1; ++j)
			point += result[j];
		point /= result.size();
		point[i - 1] += h;
		result.push_back(point);
	}

	return result;
}
