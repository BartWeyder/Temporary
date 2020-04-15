/// @file CompressedCompareMatrixTests.cpp
/// @brief Test suite for CCompressedCompareMatrix tests.
/// @author Yevhenii Kizim
/// @date 4/11/2020

#include "pch.h"
#include "CppUnitTest.h"

#include "CompressedCompareMatrix.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace WeightsCalculatorUT
{
	TEST_CLASS(CompressedCompareMatrixTests)
	{
	public:
		
      TEST_METHOD(TestFailedCreation)
      {
         // ACT/ASSERT
         Assert::ExpectException<std::logic_error>(
            []() {CCompressedCompareMatrix({ 1, 2, 3, 4, 5, 6, 7 }); });
         Assert::ExpectException<std::logic_error>(
            []() {CCompressedCompareMatrix(std::vector<Value>{ 1, 2, 3, 4, 5, 6, 7 }); });
      }

		TEST_METHOD(TestIsFull)
		{
         // INIT
         const CCompressedCompareMatrix fullMatrix({ 7., 6., 5., 6. / 7, 5. / 7, 5. / 6 });
         const CCompressedCompareMatrix notFullMatrix({ 7, 0, 5, 6. / 7, 5. / 7, 5. / 6 });

         // ACT/ASSERT
         Assert::IsTrue(fullMatrix.IsFull());
         Assert::IsFalse(notFullMatrix.IsFull());
		}

      TEST_METHOD(TestIsConnected)
      {
         // INIT
         const CCompressedCompareMatrix connectedMatrix({ 7, 6, 0, 0, 1, 0});
         const CCompressedCompareMatrix notConnectedMatrix({ 7, 6, 0, 6./7, 0, 0});
         const CCompressedCompareMatrix anotherConnectedMatrix({ 7, 0, 5, 0, 0, 0.5 });

         // ACT/ASSERT
         Assert::IsTrue(connectedMatrix.IsConnected());
         Assert::IsFalse(notConnectedMatrix.IsConnected());
         Assert::IsTrue(anotherConnectedMatrix.IsConnected());
      }

      TEST_METHOD(TestValueGet)
      {
         // INIT
         const CCompressedCompareMatrix matrix({7, 6, 5, 1. / 2, 1, 1. / 2});

         // ACT/ASSERT
         Assert::AreEqual(6., matrix.Get(0, 2)); // upper triangle
         Assert::AreEqual(1. / 5, matrix.Get(3, 0)); // lower triangle
         Assert::AreEqual(1., matrix.Get(1, 1)); // diagonal
      }

      TEST_METHOD(TestValueSet)
      {
         // INIT
         CCompressedCompareMatrix matrix({ 7, 6, 5, 1. / 2, 1, 1. / 2 });

         // ACT
         matrix.Set(0, 1, 0);
         matrix.Set(1, 3, 4);

         // ASSERT
         Assert::AreEqual(0., matrix.Get(0, 1));
         Assert::AreEqual(0., matrix.Get(1, 0));
         Assert::AreEqual(4., matrix.Get(1, 3));
         Assert::AreEqual(1. / 4, matrix.Get(3, 1));
      }
	};
}
