// WeightsCalculatorSimpleUI.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <rapidcsv.h>

#include "ExpertsEstimatesHolder.h"
#include "WeightsCalculator.h"

namespace 
{
   constexpr auto sc_expertsRateRowIndex = 1U; ///< in second row of scv dimension of matrix is saved
   constexpr auto sc_firstDataRow = 2U; ///< Row from which matrix data is saved

   /// @brief Parses csv file by custom rules: first row is header, second stores dimension
   CExpertsEstimatesHolder parseCsv(const std::string& i_path)
   {
      const rapidcsv::Document doc(i_path, rapidcsv::LabelParams(0, -1));

      const auto dimension = doc.GetCell<size_t>(0, 0);
      const auto expertsRatesString = doc.GetRow<std::string>(sc_expertsRateRowIndex);
      std::vector<Value> expertsRates;
      for (auto& rateString : expertsRatesString)
      {
         if (rateString.empty()) break;
         expertsRates.emplace_back(std::atof(rateString.c_str()));
      }

      CExpertsEstimatesHolder expertsEstimates;
      for (size_t i = 0; i < expertsRates.size(); ++i)
      {
         expertsEstimates.AddEstimate(CCompressedCompareMatrix{ doc.GetRow<double>(i + sc_firstDataRow) },
            expertsRates[i]);
      }

      return expertsEstimates;
   }
}

int main()
{
   const auto estimates = parseCsv("testcase.csv");
   const auto weights = estimates.CalculateMeanWeights(CWeightsCalculator::Comb);
   std::cout << "Weights: ";
   for (const auto weight : weights) std::cout << weight << " ";
   std::cout << std::endl;
}
