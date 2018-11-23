#include "pch.h"
#include "app.h"
#include <iostream>
#include <string>
#include <list>
#include <algorithm>
#include "nonlinear_optimization.hpp"

void App::launch()
{
	char input;
	if (start_point.size())
	{
		
	}
	while (true)
	{
		system("cls");
		std::cout << "Welcome to Nelder Mead method" << std::endl << "Press '1' to enter start point;" <<
			std::endl;
		if (start_point.size() > 0)
			std::cout << "Press '2' to calculate answer;" << std::endl;
		if (answer_.size() > 0)
			std::cout << "Press '3' to watch last calculated answer;" << std::endl;
		std::cout << "Press 'e' to exit program." << std::endl << ">";
		std::cin.get(input);
		std::cin.ignore();
		switch (input)
		{
		case '1':
			pointInput();
			break;
		case '2':
			if(start_point.size() > 0)
			{
				answer_ = nelder_mead(f, start_point);
			}
			else break;
		case '3':
			if(answer_.size() > 0)
			{
				std::cout << "Best point is: (";
				for (auto i = 0; i < answer_.size() - 1; ++i)
					std::cout << answer_[i] << ", ";
				std::cout << answer_[answer_.size() - 1] << ")." << std::endl << "Press any key to continue...";
				std::cin.get();
			}
			else std::cout << "\a";
			break;
		case 'e':
			return;
		default: std::cout << "\a";
		}
	}
}

void App::pointInput()
{
	std::string input;
	std::list<std::string> l;
	const auto delimiter = ' ';
	size_t pos = 0;
	
	while (true)
	{
		system("cls");
		std::cout << "Enter your coordinates with space-delimiter or type 'exit' to exit to main menu." << 
			std::endl;
		std::getline(std::cin, input);
		if (input == "exit")
		{
			start_point.resize(0);
			return;
		}
		while ((pos = input.find(delimiter)) != std::string::npos)
		{
			l.push_back(input.substr(0, pos));
			input.erase(0, pos + 1);
		}
		if (input.size() > 0)
			l.push_back(input);
		start_point.resize(l.size());

		try
		{
			std::transform(l.begin(), l.end(), std::begin(start_point), [](const std::string & val)
			{
				return std::stod(val);
			});
		}
		catch (std::invalid_argument &ia)
		{
			std::cout << "Invalid input, press any key and try again...";
			std::cin.get();
			continue;
		}
		catch (std::out_of_range &oor)
		{
			std::cout << "Out of range, try smaller values. Press any key to continue...";
			std::cin.get();
			continue;
		}
		
		return;	
	}
}

double App::f(std::valarray<double> arg)
{
	return arg[0] * arg[0] + arg[1] * arg[1] + 2 * arg[2] * arg[2] + 2 * arg[3] * arg[3] +
		16 * arg[0] * arg[0] * arg[1] * arg[1] + 8 * arg[1] * arg[1] * arg[2] * arg[2] + 2;
}
