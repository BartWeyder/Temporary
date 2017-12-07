#include "stdafx.h"
#include "CsvReader.h"
#include <fstream>
#include <string>

csv_reader::csv_reader(string file_name)
{

	string buff;
	ifstream test_file;
	test_file.open("test1-2_1.csv", ifstream::in);
	for (size_t i = 0; i < 7; i++)
	{
		getline(test_file, buff);
	}
	for (size_t i = 0; i < 97; i++)//560; i++)
	{
		getline(test_file, buff);
		tests.push_back(test_object(buff));
	}
	test_file.close();
}

csv_reader::~csv_reader()
{
}
