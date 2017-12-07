#include "stdafx.h"
#include "white_csv_reader.h"
#include <fstream>


white_csv_reader::white_csv_reader(const std::string csv_file)
{
	std::string buff;
	std::ifstream test_file;
	test_file.open(csv_file, std::ifstream::in);
	for (size_t i = 0; i < 2; i++)
	{
		getline(test_file, buff);
	}

	getline(test_file, buff);
	auto new_order = new test_order("1");
	new_order->test_object_list.push_back(test_object_extended(buff));

	for (size_t i = 1; i < 34; i++)//560; i++)
	{
		getline(test_file, buff);
		if (isdigit(buff[0])) {
			orders.push_back(*new_order);
			new_order = new test_order(buff.substr(0, buff.find(test_object_extended::delimeter)));
		}
		new_order->test_object_list.push_back(test_object_extended(buff));
	}
	test_file.close();
}

white_csv_reader::~white_csv_reader()
{
}
