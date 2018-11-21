// Test.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include <tuple>
#include <string>

// IntList
template <int ...Ints>
struct IntList;

template <int H, int ...Ints>
struct IntList<H, Ints...>
{
	static int const Head = H;
	using Tail = IntList<Ints...>;
};

template <>
struct IntList<> {};

// Add back
template<int H, typename IL>
struct Fuck;

template<int H, int ...Ints>
struct Fuck<H, IntList<Ints...>>
{
	using type = IntList<Ints..., H>;
};

// Generate List form 0 to N-1 
template<int N>
struct Generate { using type = typename Fuck<N - 1, typename Generate<N - 1>::type>::type; };

template<>
struct Generate<0> { using type = IntList<>; };

// Apply Functor to every member of list
template<typename Ft, typename ...Args, int ...Indices>
auto apply(Ft f, std::tuple<Args...> t, IntList<Indices...>) ->decltype(f(std::get<Indices>(t) ...))
{
	return f(std::get<Indices>(t) ...);
}

template<typename Ft, typename ...Args>
auto apply(Ft f, std::tuple<Args...> t) ->decltype(apply(f, t, typename Generate<sizeof ...(Args)>::type()))
{
	return apply(f, t, typename Generate<sizeof ...(Args)>::type());
}


// Add front
template<int H, typename IL>
struct IntCons;

template<int H, int ...Ints>
struct IntCons<H, IntList<Ints...>>
{
	using type = IntList<H, Ints...>;
};


// Apply binary Functor for every pair of elements from first end second lists (like std::transform)
template<typename IL1, typename IL2, template<int V1, int V2> class F>
struct Zip
{
	using type = typename IntCons<
		F<IL1::Head, IL2::Head>::value,
		typename Zip<typename IL1::Tail, typename IL2::Tail, F>::type
	>::type;
};

template<template<int V1, int V2> class F>
struct Zip<IntList<>, IntList<>, F> { using type = IntList<>; };

// Binary functor for adding
template<int a, int b>
struct Plus
{
	static int const value = a + b;
};

// два списка одной длины
using L1 = IntList<1, 2, 3, 4, 5>;
using L2 = IntList<1, 3, 7, 7, 2>;

// результат применения — список с поэлементными суммами
using L3 = Zip<L1, L2, Plus>::type;  // IntList<2, 5, 10, 11, 7>


// Binary Functor -
template<int a, int b>
struct Minus
{
	static int const value = a - b;
};

// To save numerics with types like velocity (m\s) etc.
template<typename D>
class Quantity;

template<int ...Dims>
class Quantity<IntList<Dims...>>
{
	using type = typename Zip<IntList<0, 0, 0, 0, 0, 0, 0>, IntList<Dims...>, Plus>::type;
	double value_ = 0;
public:
	Quantity() = default;
	explicit Quantity(const double v) : value_(v) {}

	Quantity(const Quantity& other)
		: value_(other.value_)
	{
	}

	Quantity(Quantity&& other) noexcept
		: value_(other.value_)
	{
	}

	Quantity& operator=(const Quantity& other)
	{
		if (this == &other)
			return *this;
		value_ = other.value_;
		return *this;
	}

	Quantity& operator=(Quantity&& other) noexcept
	{
		if (this == &other)
			return *this;
		value_ = other.value_;
		return *this;
	}

	double value() const { return  value_; }

};

template<int ...Dims>
Quantity<IntList<Dims...>>& operator+(const Quantity<IntList<Dims...>>& q1, const Quantity<IntList<Dims...>>& q2)
{
	return Quantity<IntList<Dims...>>(q1.value() + q2.value());
}

template<int ...Dims>
Quantity<IntList<Dims...>>& operator-(const Quantity<IntList<Dims...>>& q1, const Quantity<IntList<Dims...>>& q2)
{
	return Quantity<IntList<Dims...>>(q1.value() - q2.value());
}

template<int ...Dims1, int ...Dims2>
Quantity<typename Zip<IntList<Dims1...>, IntList<Dims2...>, Plus>::type> operator*(
	const Quantity<IntList<Dims1...>>& q1, const Quantity<IntList<Dims2...>>& q2)
{
	return Quantity<typename Zip<IntList<Dims1...>, IntList<Dims2...>, Plus>::type>(q1.value() * q2.value());
}

template<int ...Dims1, int ...Dims2>
Quantity<typename Zip<IntList<Dims1...>, IntList<Dims2...>, Minus>::type> operator/(
	const Quantity<IntList<Dims1...>>& q1, const Quantity<IntList<Dims2...>>& q2)
{
	return Quantity<typename Zip<IntList<Dims1...>, IntList<Dims2...>, Minus>::type>(q1.value() / q2.value());
}

template<int ...Dims>
Quantity<IntList<Dims...>>& operator*(double q1, const Quantity<IntList<Dims...>>& q2)
{
	return Quantity<IntList<Dims...>>(q1 * q2.value());
}

template<int ...Dims>
Quantity<IntList<Dims...>>& operator*(const Quantity<IntList<Dims...>>& q1, double q2)
{
	return Quantity<IntList<Dims...>>(q1.value() * q2);
}

template<int ...Dims>
Quantity<typename Zip<IntList<0, 0, 0, 0, 0, 0, 0>, IntList<Dims...>, Minus>::type> operator/(
	double q1, const Quantity<IntList<Dims...>>& q2)
{
	return Quantity<IntList<0, 0, 0, 0, 0, 0, 0>>(q1) / q2;
}

template<int ...Dims>
Quantity<IntList<Dims...>>& operator/(const Quantity<IntList<Dims...>>& q1, double q2)
{
	return Quantity<IntList<Dims...>>(q1.value() / q2);
}

template<int m = 0, int kg = 0, int s = 0, int A = 0, int K = 0, int mol = 0, int cd = 0>
using Dimension = IntList<m, kg, s, A, K, mol, cd>;

using NumberQ = Quantity<Dimension<>>;          // число без размерности
using LengthQ = Quantity<Dimension<1>>;          // метры
using MassQ = Quantity<Dimension<0, 1>>;       // килограммы
using TimeQ = Quantity<Dimension<0, 0, 1>>;    // секунды
using VelocityQ = Quantity<Dimension<1, 0, -1>>;   // метры в секунду
using AccelQ = Quantity<Dimension<1, 0, -2>>;   // ускорение, метры в секунду в квадрате
using ForceQ = Quantity<Dimension<1, 1, -2>>;   // сила в ньютонах

#include <type_traits>
#include <utility>


// Check if has size method
template<typename T> struct has_size
{
private:
	static int detect(...);
	template<typename U> static decltype(std::declval<U>().size()) detect(const U&);
public:
	static constexpr bool value = std::is_same<size_t, decltype(detect(std::declval<T>()))>::value;
};

// Check if has size field
template<typename T> struct has_size_
{
private:
	static int detect(...);
	template<typename U> static decltype(std::declval<U>().size) detect(const U&);
public:
	static constexpr bool value = std::is_same<size_t, decltype(detect(std::declval<T>()))>::value;
};

// Overloads for method or field if any exists
template<class T>
typename std::enable_if<
	has_size<T>::value, size_t>::type
	get_size(const T& t) { return t.size(); }

template<class T>
typename std::enable_if<
	has_size_<T>::value, size_t>::type
	get_size(const T& t) { return t.size; }

//int main()
//{
//	std::string s{ "Hello" };
//	size_t s_size = get_size(s);   // 5, вызывается метод size()
//	std::cout << (has_size<std::string>::value ? "Has method" : "Does not have method") << std::endl;
//
//	struct Struct
//	{
//		size_t size = 0;
//	};
//
//	Struct x{ 10 };
//	std::cout << (has_size_<Struct>::value ? "Has field" : "Does not have field") << std::endl;
//
//	size_t x_size = get_size(x);
//}

