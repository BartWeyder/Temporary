#pragma once
#include <string>
#include <list>
#include "test_order.h"

class white_csv_reader
{
public:
	explicit white_csv_reader(std::string csv_file);
	~white_csv_reader();
	std::list<test_order> orders;
};

