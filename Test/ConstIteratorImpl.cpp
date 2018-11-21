// Test.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include <vector>
#include <list>
#include <iterator>


template<class T>
class VectorList
{
private:
	using VectT = std::vector<T>;
	using ListT = std::list<VectT>;



public:
	using value_type = T;

	VectorList() = default;
	VectorList(VectorList const &) = default;
	VectorList(VectorList &&) = default;

	VectorList & operator=(VectorList &&) = default;
	VectorList & operator=(VectorList const &) = default;

	// метод, который будет использоваться для заполнения VectorList
	// гарантирует, что в списке не будет пустых массивов
	template<class It>
	void append(It p, It q) // определена снаружи
	{
		if (p != q)
			data_.push_back(VectT(p, q));
	}


	bool empty() const { return size() == 0; }

	// определите метод size
	size_t size() const
	{
		size_t i = 0;
		for (auto it = this->begin(); it != this->end(); ++it)
			++i;
		return i;
	}

	// определите const_iterator
	struct const_iterator : std::iterator<std::bidirectional_iterator_tag, const T>
	{
		const_iterator() = default;
		explicit const_iterator(ListT const * data) : data_(data) {};
		const_iterator(const const_iterator&) = default;
		const_iterator(ListT const * data, bool isBegin) : data_(data)
		{
			if (isBegin)
			{
				itl_ = data_->begin();
				itv_ = (*itl_).begin();
			}
			else
			{
				itl_ = --(data_->end());
				itv_ = (*itl_).end();
			}
		};
		const_iterator& operator=(const const_iterator&) = default;
		~const_iterator() = default;

		const_iterator& operator++()
		{
			// some changes might be needed here. Don't fully understand logic of iterator behaviour
			/*if (itv_ == (*itl_).end())
			{
				if (++itl_ == data_->end())
				{
					--itl_;
					return *this;
				}
				itv_ = (*itl_).begin();
			}*/
			if (itv_ == itl_->end() && ++itl_ == data_->end())
			{
				--itl_;
				return *this;
			}
			if (++itv_ == itl_->end())
			{
				if (++itl_ == data_->end())
					--itl_;
				else
					itv_ = (*itl_).begin();
			}
			return *this;
		}

		const_iterator operator++ (int)
		{
			const_iterator tmp(*this);
			++(*this);
			return tmp;
		}

		const_iterator& operator--()
		{
			if (itv_ == (*itl_).begin())
			{
				if (itl_ == data_->begin())
					return *this;
				--itl_;
				itv_ = --((*itl_).end());
			}
			else
				--itv_;
			return *this;
		}

		const_iterator operator-- (int)
		{
			const_iterator tmp(*this);
			--(*this);
			return tmp;
		}

		bool operator!= (const const_iterator& it) const
		{
			return !(*this == it);
		}

		bool operator== (const const_iterator& it) const
		{
			if (data_ == it.data_ && itl_ == it.itl_ && itv_ == it.itv_)
				return true;
			return false;
		}

		const T& operator*() const
		{
			return *itv_;
		}

		const T* operator->() const
		{
			return &(*itv_);
		}



	private:
		ListT const * data_;
		typename ListT::const_iterator itl_;
		typename VectT::const_iterator itv_;
	};

	// определите методы begin / end
	const_iterator begin() const
	{
		return (data_.empty()) ? const_iterator() : const_iterator(&data_, true);
	}
	const_iterator end() const
	{
		return (data_.empty()) ? const_iterator() : const_iterator(&data_, false);
	}

	// определите const_reverse_iterator
	using const_reverse_iterator = std::reverse_iterator<const_iterator>;

	// определите методы rbegin / rend
	const_reverse_iterator rbegin() const { return std::reverse_iterator<const_iterator>(end()); }
	const_reverse_iterator rend()   const { return std::reverse_iterator<const_iterator>(begin()); }

private:
	ListT data_;
};

//int main()
//{
//	VectorList<char> vlist;
//
//	std::vector<char> v1;
//	v1.push_back('A');
//	v1.push_back('B');
//	v1.push_back('C');
//
//	std::vector<char> v2;
//	v2.push_back('D');
//	v2.push_back('E');
//	v2.push_back('F');
//	v2.push_back('G');
//	vlist.append(v1.begin(), v1.end());
//	vlist.append(v2.begin(), v2.end());
//
//	auto i = vlist.begin();
//
//	std::cout << "Size is " << vlist.size() << std::endl;
//	std::cout << "begin is " << *i << std::endl;
//	std::cout << "std::distance(begin,end)﻿ " << (std::distance(vlist.begin(), vlist.end())) << std::endl;
//	std::cout << "*(++begin) == 'B'? " << (*++vlist.begin() == 'B') << std::endl;
//	std::cout << "*(++begin) == 'A'? " << (*++vlist.begin() == 'A') << std::endl;
//	std::cout << std::endl;
//
//
//	std::cout << "Test ++i" << std::endl;
//	for (i = vlist.begin(); vlist.end() != i; ++i)
//		std::cout << *i << " ";
//	std::cout << std::endl;
//	std::cout << std::endl;
//
//	std::cout << "Test i++" << std::endl;
//	for (i = vlist.begin(); vlist.end() != i; i++)
//		std::cout << *i << " ";
//	std::cout << std::endl;
//	std::cout << std::endl;
//
//	std::cout << "Test --i" << std::endl;
//	for (i = vlist.end(); vlist.begin() != i;)
//		std::cout << *--i << " ";
//	std::cout << std::endl;
//	std::cout << std::endl;
//
//	std::cout << "Test i--" << std::endl;
//	for (i = vlist.end(); vlist.begin() != i;) {
//		i--;
//		std::cout << *i << " ";
//	}
//	std::cout << std::endl;
//	std::cout << std::endl;
//
//
//	std::cout << std::endl;
//	auto j = vlist.rbegin();
//	std::cout << "rbegin is " << *j << std::endl;
//	j = --vlist.rend();
//	std::cout << "--rend is " << *j << std::endl;
//
//	std::cout << "Test reverse_const_iterator ++" << std::endl;
//	for (j = vlist.rbegin(); j != vlist.rend(); ++j)
//		std::cout << *j << " ";
//	std::cout << std::endl;
//
//	std::vector<std::string> string_vec = { "ahah", "sooqa", "moja", "zhopa" };
//	VectorList<std::string> listec;
//	listec.append(string_vec.begin(), string_vec.end());
//	std::cout << listec.begin()->c_str();
//
//	VectorList<char> empty_list;
//	auto eit = empty_list.begin();
//
//	system("pause");
//	return 0;
//}
