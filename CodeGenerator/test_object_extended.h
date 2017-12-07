#pragma once
#include <string>

class test_object_extended
{
public:
	explicit test_object_extended(std::string input);
	~test_object_extended();
	static const auto delimeter = ',';
	std::string shipping;
	std::string gift_wrap;
	std::string product_type;
	std::string quantity;
	std::string price;
	std::string dd, mm, yy;
	std::string total_deposit;
};

