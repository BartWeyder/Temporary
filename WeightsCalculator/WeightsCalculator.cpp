/// @file WeightsCalculator.cpp
/// @brief Holds CWeightsCalculator definition.
/// @author Yevhenii Kizim
/// @date 4/11/2020

#include "WeightsCalculator.h"

#include "IdeallyConsistentMatrixFactory.h"

#include <algorithm>
#include <numeric>

namespace 
{
   /// @brief Normalizes vector: divides each value on sum of all elements.
   /// @param o_vector out, Vector to normalize.
   void normalizeVector(std::vector<Value>& o_vector)
   {
      const auto sum = std::accumulate(o_vector.begin(), o_vector.end(), 0.);
      std::for_each(o_vector.begin(), o_vector.end(), [&sum](auto& i_elem) { i_elem /= sum; });
   }
}

////////////////////////////////////////////////////////////////////////////////
std::vector<Value> CWeightsCalculator::Eigen(const CCompressedCompareMatrix & i_compareMatrix)
{
   std::vector<Value> result(i_compareMatrix.Dimension());
   for (size_t i = 0; i < i_compareMatrix.Dimension(); ++i)
   {
      result[i] = getGeomMean(i_compareMatrix.GetRow(i));
   }

   normalizeVector(result);
   return result;
}

////////////////////////////////////////////////////////////////////////////////
std::vector<Value> CWeightsCalculator::Comb(const CCompressedCompareMatrix & i_compareMatrix)
{
   CIdeallyConsistentMatrixFactory factory(i_compareMatrix);
   std::vector<Value> weights(i_compareMatrix.Dimension(), 0.);
   size_t matrixCount = 0;

   while (const auto idealPCM = factory.GetNext())
   {
      ++matrixCount;
      auto weightsOfCurrentPCM = idealPCM->GetColumn(idealPCM->Dimension() - 1);
      normalizeVector(weightsOfCurrentPCM);
      std::transform(weights.begin(), weights.end(), weightsOfCurrentPCM.begin(), weights.begin(), std::plus());
   }

   // perform last step of getting average of all alternative's weights
   std::for_each(weights.begin(), weights.end(), [&matrixCount](auto& i_elem) { i_elem /= matrixCount; });

   return weights;
}

////////////////////////////////////////////////////////////////////////////////
Value CWeightsCalculator::getGeomMean(const std::vector<Value>& i_vector)
{
   auto result = 1.;
   for (const auto& value : i_vector)
   {
      result *= value;
   }
   return std::pow(result, 1. / i_vector.size());
}
