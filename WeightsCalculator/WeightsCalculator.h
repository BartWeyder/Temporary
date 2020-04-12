/// @file WeightsCalculator.h
/// @brief Holds CWeightsCalculator declaration.
/// @author Yevhenii Kizim
/// @date 4/11/2020

#pragma once

#include "CompressedCompareMatrix.h"

/// @class CWeightsCalculator
/// @brief Aggregator of static methods for alternatives' weights calculation.
class CWeightsCalculator
{
public:
   /// @brief Computes alternatives' weights for specified PCM using Eigen vector algorithm.
   [[nodiscard]] static std::vector<Value> Eigen(const CCompressedCompareMatrix& i_compareMatrix);

   /// @brief Computes alternatives' weights for specified PCM using combinatorial algorithm.
   [[nodiscard]] static std::vector<Value> Comb(const CCompressedCompareMatrix& i_compareMatrix);

private:
   /// @brief Returns geometric mean of array values.
   [[nodiscard]] static Value getGeomMean(const std::vector<Value>& i_vector);
};

