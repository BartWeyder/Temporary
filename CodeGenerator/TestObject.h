#pragma once
#include <iostream>

using namespace std;

class test_object
{
public:
	explicit test_object(string input);
	~test_object();
	string test_number;
	string shipping;
	string gift_wrap;
	string product_type;
	bool is_fee_percentage;
	string price;
	string dd, mm, yy;
	string total_deposit;
};

