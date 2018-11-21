// Test.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>

#include <typeinfo>
#include <typeindex>
#include <utility>
#include <functional>
#include <map>

// Base - базовый класс иерархии
// Result - тип возвращаемого значения мультиметода
// Commutative - флаг, который показывает, что
// мультиметод коммутативный (т.е. f(x,y) = f(y,x)).

struct Shape {
	virtual ~Shape() {};
};

// прямоугольник
struct Rectangle : Shape {
	~Rectangle() {};
};

// треугольник
struct Triangle : Shape {
	~Triangle() {};
};

// функция для проверки пересечения двух прямоугольников
bool is_intersect_r_r(Shape * a, Shape * b) { return true; };

// функция для проверки пересечения прямоугольника и треугольника
bool is_intersect_r_t(Shape * a, Shape * b) { return true; };

template<class Base, class Result, bool Commutative>
struct Multimethod2
{
	std::map<std::pair<std::type_index, std::type_index>, std::function<Result(Base*, Base*)>> implementations;
	// устанавливает реализацию мультиметода
	// для типов t1 и t2 заданных через typeid 
	// f - это функция или функциональный объект
	// принимающий два указателя на Base 
	// и возвращающий значение типа Result
	void addImpl(const std::type_info& t1, const std::type_info& t2, std::function<Result(Base*, Base*)> f)
	{
		implementations.emplace(std::make_pair<std::type_index, std::type_index>(t1, t2), f);
	}

	// проверяет, есть ли реализация мультиметода
	// для типов объектов a и b
	bool hasImpl(Base * a, Base * b) const
	{
		auto res = implementations.find(std::make_pair(std::type_index(typeid(*a)), std::type_index(typeid(*b))));
		if (res != implementations.end())
			return true;

		if (Commutative)
		{
			res = implementations.find(std::make_pair(std::type_index(typeid(*b)), std::type_index(typeid(*a))));
			if (res != implementations.end())
				return true;
		}

		return false;
	}

	// Применяет мультиметод к объектам
	// по указателям a и b
	Result call(Base * a, Base * b) const
	{
		// возвращает результат применения реализации
		// мультиметода к a и b
		auto iter = implementations.find(std::make_pair(std::type_index(typeid(*a)), std::type_index(typeid(*b))));
		if (iter != implementations.end())
			return iter->second(a, b);
		if (Commutative)
		{
			iter = implementations.find(std::make_pair(std::type_index(typeid(*b)), std::type_index(typeid(*a))));
			if (iter != implementations.end())
				return iter->second(b, a);
		}
	}
};


//int main()
//{
//	Multimethod2<Shape, bool, true> is_intersect;
//
//	// добавляем реализацию мультиметода для двух прямоугольников
//	is_intersect.addImpl(typeid(Rectangle), typeid(Rectangle), is_intersect_r_r);
//
//	// добавляем реализацию мультиметода для прямоугольника и треугольника
//	is_intersect.addImpl(typeid(Rectangle), typeid(Triangle), is_intersect_r_t);
//
//	// создаём две фигуры    
//	Shape * s1 = new Triangle();
//	Shape * s2 = new Rectangle();
//
//	// проверяем, что реализация для s1 и s2 есть
//	if (is_intersect.hasImpl(s1, s2))
//	{
//		// вызывается функция is_intersect_r_t(s2, s1)
//		const auto res = is_intersect.call(s1, s2);
//		std::cout << "Hello World!\n";
//		std::cout << res;
//
//	}
//}
