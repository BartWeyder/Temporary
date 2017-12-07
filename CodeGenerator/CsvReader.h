#pragma once
#include <iostream>
#include "TestObject.h"
#include <list>

using namespace std;

class csv_reader
{
public:
	explicit csv_reader(string file_name);
	~csv_reader();
	list<test_object> tests;
};

