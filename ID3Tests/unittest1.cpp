#include "stdafx.h"
#include "CppUnitTest.h"
#include "ID3Node.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace ID3Tests
{		
	TEST_CLASS(ID3MainTests)
	{
	public:
		const AttributeColumn outlook
		{ 
			"Rainy", "Rainy", "Overcast", "Sunny", "Sunny", "Sunny", "Overcast", "Rainy", 
			"Rainy", "Sunny", "Rainy", "Overcast", "Overcast", "Sunny"
		};

		const AttributeColumn Temp
		{ "Hot", "Hot", "Hot", "Mid", "Cool", "Cool", "Cool", "Mid", "Cool", "Mid", "Mid", "Mid", "Hot", "Mid" };

		const AttributeColumn humidity 
		{
			"High", "High", "High", "High", "Normal", "Normal", "Normal", "High", "Normal", "Normal", "Normal", "High", 
			"Normal", "High"
		};

		const AttributeColumn windy
		{
			"False", "True", "False", "False", "False", "True", "True", "False", "False", "False", "True", "True",
			"False", "True"
		};
		const AttributeColumn result
		{ "No", "No", "Yes", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No" };

		Examples examples{ outlook, Temp, humidity, windy, result };


		TEST_METHOD(CheckTestExample)
		{
			ID3Node tree{ examples, { 0,1,2,3 } };
			Example example{ "Rainy", "Hot", "High", "False" };
			Assert::AreEqual(*result.begin(), tree.GetValue(example));
		}

	};
}