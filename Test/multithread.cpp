// Test.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include <vector>
#include <future>
#include <list>
#include <thread>


//template <typename Iter, typename F1, typename F2>
//auto map_reduce(Iter p, Iter q, F1 f1, F2 f2, size_t threads)->decltype(f1(*p))
////... map_reduce(... p, ... q, ... f1, ... f2,  size_t threads)
//{
//	auto calc = [](Iter b, Iter e, F1 f1, F2 f2)
//	{
//		auto res = f1(*b);
//		while (++b != e)
//			res = f2(res, f1(*b));
//		return res;
//	};
//	std::vector<std::future<decltype(f1(*p))>> v;
//	v.reserve(threads);
//	const size_t part_size = std::distance(p, q) / threads;
//	for (size_t i = 0; i < threads - 1; ++i) {
//		auto tmp = p;
//		std::advance(p, part_size);
//		v.push_back(std::async(std::launch::async, calc, tmp, p, f1, f2));
//	}
//	v.push_back(std::async(std::launch::async, calc, p, q, f1, f2));
//	auto res = v.begin()->get();
//	for (auto j = ++(v.begin()); j != v.end(); ++j)
//		res = f2(res, j->get());
//	return res;
//}

// заголовок <thread> уже подключён.
// заново подключать не нужно
#include <vector>

// реализация функции mapreduce
template <typename Iter, typename F1, typename F2>
auto map_reduce(Iter p, Iter q, F1 f1, F2 f2, size_t threads)->decltype(f1(*p))
{
	std::vector<decltype(f1(*p))> v_res(threads, decltype(f1(*p))());
	auto calc = [](Iter b, Iter e, F1 f1, F2 f2, typename std::vector<decltype(f1(*p))>::iterator elm)
	{
		auto res = f1(*b);
		while (++b != e)
			res = f2(res, f1(*b));
		*elm = res;
	};
	std::vector<std::thread> v;
	v.reserve(threads);
	const size_t part_size = std::distance(p, q) / threads;
	auto bg = v_res.begin();
	for (size_t i = 0; i < threads - 1; ++i) {
		auto tmp = p;
		std::advance(p, part_size);
		v.push_back(std::thread(calc, tmp, p, f1, f2, bg++));
	}
	v.push_back(std::thread(calc, p, q, f1, f2, bg));
	for (auto &t : v)
		t.join();
	auto res = *v_res.begin();
	for (auto j = ++(v_res.begin()); j != v_res.end(); ++j)
		res = f2(res, *j);
	return res;

}

//int main()
//{
//	std::list<int> l = { 1,2,3,4,5,6,7,8,9,10 };
//	auto sum = map_reduce(l.begin(), l.end(),
//		[](int i) {return i; },
//		std::plus<int>(), 3);
//	std::cout << sum;
//}

