// Test.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include <vector>
#include <sstream>
#include <exception>
#include <string>

// описание класса исключения bad_from_string
class bad_from_string : public std::exception
{
public:
	bad_from_string(const std::string msg = "") : msg_(msg) {};
	~bad_from_string() override {};
	char const* what() const noexcept override
	{
		return msg_.c_str();
	};

private:
	std::string msg_;
};

// функция from_string
template<class T>
T from_string(std::string const& s)
{
	T tmp;
	std::istringstream stream(s);
	if (stream.fail() || stream.peek() == EOF) throw bad_from_string(s);
	char c;
	try {
		if (!(stream >> std::noskipws >> tmp) || stream.fail() || stream.peek() != EOF)
			throw bad_from_string(s);
	}
	catch (...)
	{
		throw bad_from_string(s);
	}
	return tmp;
}


#define _CATCH() catch (exception const& e) {cout<<"catch std::exception: "<< e.what();} catch (...) {cout<<"catch unknown";}
using namespace std;

//int main()
//{
//	vector<string> strings{ "123", "12.3", "", " ", "abc", " 123", "123 ", "12 3", "-1", "a", "A" };
//	for (auto& str : strings) {
//		cout << endl << "from_string(\'" << str << "\'):";
//		try { cout << endl << "<string>: "; cout << from_string<string>(str); } _CATCH()
//			try { cout << endl << "<double>: "; cout << from_string<double>(str); } _CATCH()
//			try { cout << endl << "<int>   : "; cout << from_string<int>(str); } _CATCH()
//			try { cout << endl << "<char>  : "; cout << from_string<char>(str); } _CATCH()
//			cout << endl;
//		cin.get();
//	}
//}

