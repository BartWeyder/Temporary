/// @file IdeallyConsistentMatrixFactoryTests.cpp
/// @brief Test suite for CIdeallyConsistentMatrixFactory tests.
/// @author Yevhenii Kizim
/// @date 4/12/2020

#include "pch.h"
#include "CppUnitTest.h"

#include "IdeallyConsistentMatrixFactory.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace
{
   /// @brief Provides safe compare of floating point values vectors.
   bool safeVecEq(const std::vector<Value>& i_first, const std::vector<Value>& i_second)
   {
      return std::equal(i_first.begin(), i_first.end(), i_second.begin(), i_second.end(),
         [](const auto i_val1, const auto i_val2) { return std::abs(i_val1 - i_val2) < 0.00001; });
   }
}

namespace WeightsCalculatorUT
{
   TEST_CLASS(IdeallyConsistentMatrixFactoryTests)
   {
   public:

      TEST_METHOD(TestInitialIdealPCM)
      {
         // INIT
         const CCompressedCompareMatrix matrix(4, { 7, 6, 5, 1. / 2, 1, 1. / 2 });
         const std::vector<Value> initialRawDataOracle = { 7, 6, 5, 6 / 7.,5 / 7.,5 / 6. };
         const std::vector<Value> secondRawDataOracle = { 7, 6, 7, 6./7, 1, 7. / 6 };

         // ACT
         CIdeallyConsistentMatrixFactory factory(matrix);
         const auto initial = factory.GetNext();
         const auto second = factory.GetNext();

         // ASSERT
         Assert::IsTrue(initial.has_value());
         Assert::IsTrue(safeVecEq(initialRawDataOracle, initial->Data()));
         Assert::IsTrue(second.has_value());
         Assert::IsTrue(safeVecEq(secondRawDataOracle, second->Data()));
      }
   };
}
