/// @file WeightsCalculatorTests.cpp
/// @brief Test suite for CWeightsCalculator tests.
/// @author Yevhenii Kizim
/// @date 4/11/2020

#include "pch.h"
#include "CppUnitTest.h"

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
   const CCompressedCompareMatrix sc_matrixWithEvenNumbers({ 8, 6, 4, 1. / 2, 2, 1. / 2 });
}

namespace WeightsCalculatorUT
{
   TEST_CLASS(WeightsCalculatorTests)
   {
   public:
      TEST_METHOD(EigenVectorMethodTest)
      {
         // INIT
         const std::vector<Value> oracleWeights{ 0.66113, 0.08978, 0.11097, 0.13812 };
         const std::vector<Value> oracleWeightsForEvenValuesMatrix{ 0.65731, 0.10500, 0.11283, 0.12486 };

         // ACT
         const auto weights = CWeightsCalculator::Eigen(sc_matrix);
         const auto weightsOfEvenValuesMatrix = CWeightsCalculator::Eigen(sc_matrixWithEvenNumbers);

         // ASSERT
         Assert::IsTrue(safeVecEq(oracleWeights, weights));
         Assert::IsTrue(safeVecEq(oracleWeightsForEvenValuesMatrix, weightsOfEvenValuesMatrix));
      }

      TEST_METHOD(CombinatorialMethodTest)
      {
         // INIT
         const std::vector<Value> oracleWeights{ 0.64737, 0.09362, 0.11588, 0.14313 };
         const std::vector<Value> oracleWeightsForEvenValuesMatrix{ 0.62390, 0.11875, 0.12065, 0.13670 };

         // ACT
         const auto weights = CWeightsCalculator::Comb(sc_matrix);
         const auto weightsOfEvenValuesMatrix = CWeightsCalculator::Comb(sc_matrixWithEvenNumbers);

         // ASSERT
         Assert::IsTrue(safeVecEq(oracleWeights, weights));
         Assert::IsTrue(safeVecEq(oracleWeightsForEvenValuesMatrix, weightsOfEvenValuesMatrix));
      }

      TEST_METHOD(NotFullMatrixTest)
      {
         // INIT
         const CCompressedCompareMatrix matrix({ 7, 0, 0, 1. / 2, 0, 1. / 2 });
         const std::vector<Value> oracleWeights{ 0.5, 0.07143, 0.14286, 0.28571 };

         // ACT
         const auto weights = CWeightsCalculator::Comb(matrix);

         // ASSERT
         Assert::IsTrue(safeVecEq(oracleWeights, weights));
      }
   };
}