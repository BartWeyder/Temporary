#pragma once
#include <iostream>

using namespace std;

class TestObject
{
public:
	TestObject(string input);
	~TestObject();
	string test_number;
	string shipping;
	string gift_wrap;
	string product_type;
	bool is_fee_percentage;
	string price;
	string dd, mm, yy;
	string total_deposit;
};

