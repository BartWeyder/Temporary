/// @file ExpertsEstimatesHolderTests.cpp
/// @brief Test suite for CExpertsEstimatesHolder tests.
/// @author Yevhenii Kizim
/// @date 4/12/2020

#include "pch.h"
#include "CppUnitTest.h"

#include "ExpertsEstimatesHolder.h"
#include "WeightsCalculator.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace
{
   /// @brief Provides safe compare of floating point values vectors.
   bool safeVecEq(const std::vector<Value>& i_first, const std::vector<Value>& i_second)
   {
      return std::equal(i_first.begin(), i_first.end(), i_second.begin(), i_second.end(),
         [](const auto i_val1, const auto i_val2) { return std::abs(i_val1 - i_val2) < 0.00001; });
   }

   const CCompressedCompareMatrix sc_matrix({ 7, 6, 5, 1. / 2, 1, 1. / 2 });
}

namespace WeightsCalculatorUT
{
   TEST_CLASS(ExpertsEstimatesHolderTests)
   {
   public:

      TEST_METHOD(NotSufficentDataForCalculation)
      {
         // INIT
         CExpertsEstimatesHolder expertsEstimatesHolder;
         expertsEstimatesHolder.AddEstimate(sc_matrix, 0.8);

         // ACT / ASSERT
         Assert::ExpectException<std::logic_error>(
            [&expertsEstimatesHolder]()
            {
               [[maybe_unused]] const auto res = expertsEstimatesHolder.CalculateMeanWeights(CWeightsCalculator::Comb);
            });
      }

      TEST_METHOD(TestMultipleExpertsBasedWeights)
      {
         // INIT
         const CCompressedCompareMatrix matrixWithEvenNumbers({ 8, 6, 4, 1. / 2, 2, 1. / 2 });
         const CCompressedCompareMatrix lazyExpertMatrix({ 7, 0, 0, 1. / 2, 0, 1. / 2 });

         CExpertsEstimatesHolder expertsEstimatesHolder;
         expertsEstimatesHolder.AddEstimate(sc_matrix, 0.4);
         expertsEstimatesHolder.AddEstimate(matrixWithEvenNumbers, 0.4);
         expertsEstimatesHolder.AddEstimate(lazyExpertMatrix, 0.2);

         const std::vector<Value> oracleWeights{ 0.613456633, 0.09877792, 0.124359595, 0.163405852 };

         // ACT
         const auto weights = expertsEstimatesHolder.CalculateMeanWeights(CWeightsCalculator::Comb);

         // ASSERT
         // TODO: move safe equal function to some utility file
         Assert::IsTrue(safeVecEq(oracleWeights, weights));
      }
   };
}
