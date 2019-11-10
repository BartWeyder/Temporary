// DecisionTreeExecuter.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "rapidcsv.h"
#include "ID3Node.h"
#include "DataUtils.h"

/// @brief Executable to run from console.
/// @params
///          1) Training data length - how many rows we take to train tree.
///          2) Path to data set file (in .csv format).
///          3) Path to save recognition results (with file name).
int main(int argc, char **argv)
{
   if (argc > 4) return -1;

   // Default values
   constexpr auto standartTrainingDataLen = 15;
   constexpr auto standartCSVFile = "MP-06-Kizim.csv";
   constexpr auto standartOutputFile = "TreeRecognitionResult.csv";

   // Values to use
   const auto trainingDataLen = argc >= 2 ? std::stoi(argv[1]) : standartTrainingDataLen;
   const auto CSVFile = argc >= 3 ? argv[2] : standartCSVFile;
   const auto outputFileName = argc >= 4 ? argv[3] : standartOutputFile;

   // Read file
   rapidcsv::Document doc(CSVFile, rapidcsv::LabelParams(-1, -1), rapidcsv::SeparatorParams(';'));

   Examples fullSet(doc.GetColumnCount()); // Full data set
   Examples trainingExamples(doc.GetColumnCount()); // Only first n rows for training purposes
   for (size_t i = 0; i < trainingDataLen; ++i)
   {
      InsertRow(trainingExamples, doc.GetRow<std::string>(i));
      InsertRow(fullSet, doc.GetRow<std::string>(i));
   }
   Examples checkExamples(doc.GetColumnCount()); // Rest rows after training one to test tree. 
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

   // Prepare output file
   std::ofstream file(outputFileName);
   file << "Test Case,Expected,Algorithm Output" << std::endl;
   file.close();
   rapidcsv::Document output(outputFileName, rapidcsv::LabelParams(0, -1));

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
      output.SetRow(i, Row{ std::to_string(trainingDataLen + i), expected, actual });
   }

   output.Save();
   std::cout << "Right classified: " << rightCounter << "/" << doc.GetRowCount() - trainingDataLen;
}
