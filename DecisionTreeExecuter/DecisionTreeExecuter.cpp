// DecisionTreeExecuter.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "rapidcsv.h"
#include "ID3Node.h"
#include "DataUtils.h"

/// @brief Executable to run from console.
/// @params Works in 2 ways: 
///          - with no params - standart values will be used;
///          - with 2 params: training data length and path to CSV file.
int main(int argc, char **argv)
{
	if (argc != 1 && argc != 3) return -1;

	constexpr auto standartTrainingDataLen = 15;
	constexpr auto standartCSVFile = "MP-06-Kizim.csv";
	const auto trainingDataLen = argc == 0 ? standartTrainingDataLen : std::stoi(argv[1]);
	const auto CSVFile = argc == 0 ? standartCSVFile : argv[2];

	rapidcsv::Document doc(CSVFile, rapidcsv::LabelParams(-1, -1), rapidcsv::SeparatorParams(';'));
	Examples fullSet(doc.GetColumnCount());
	Examples trainingExamples(doc.GetColumnCount());
	for (size_t i = 0; i < trainingDataLen; ++i)
	{
		InsertRow(trainingExamples, doc.GetRow<std::string>(i));
		InsertRow(fullSet, doc.GetRow<std::string>(i));
	}
	Examples checkExamples(doc.GetColumnCount());
	for (size_t i = trainingDataLen; i < doc.GetRowCount(); i++)
	{
		InsertRow(checkExamples, doc.GetRow<std::string>(i));
		InsertRow(fullSet, doc.GetRow<std::string>(i));
	}

	// Prepare attributes "header" list.
	Attributes i_attributes;
	for (size_t i = 0; i < doc.GetColumnCount() - 1; i++)
	{
		i_attributes.insert(i);
	}

	// Prepare all unique attribute values.
	UniqueAttributeValues map;
	for (const auto attrIdx : i_attributes)
	{
		map.insert({ attrIdx, UniqueValues(fullSet[attrIdx].begin(), fullSet[attrIdx].end()) });
	}
	const auto uniqueAttributeValues = std::make_shared<const UniqueAttributeValues>(std::move(map));

	// Build tree
	ID3Node tree{ trainingExamples, i_attributes, uniqueAttributeValues };

	// Check our tree on test data set.
	auto rightCounter = 0;
	for (size_t i = 0; i < checkExamples.begin()->size(); ++i)
	{
		const auto actual = tree.GetValue(GetRow(checkExamples, i));
		const auto expected = (*checkExamples.rbegin())[i];
		std::cout << expected << " and should be " << actual << std::endl;
		if (expected == actual) ++rightCounter;
	}
	std::cout << "Right classified: " << rightCounter << "/" << doc.GetRowCount() - trainingDataLen;
}
