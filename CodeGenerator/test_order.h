#pragma once
#include <string>
#include "test_object_extended.h"
#include <list>

class test_order
{
public:
	explicit test_order(std::string nmbr);
	~test_order();
	std::string number;
	std::list<test_object_extended> test_object_list;
	double total_price = 0.0;
};

