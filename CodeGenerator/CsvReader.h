#pragma once
#include <iostream>
#include "TestObject.h"
#include <list>

using namespace std;

class CsvReader
{
public:
	CsvReader(string file_name);
	~CsvReader();
	list<TestObject> tests;
};

