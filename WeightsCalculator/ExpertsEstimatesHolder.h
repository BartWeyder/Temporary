/// @file ExpertsEstimatesHolder.h
/// @brief Holds CExpertsEstimatesHolder class declaration.
/// @author Yevhenii Kizim
/// @date 4/12/2020

#pragma once

#include "CompressedCompareMatrix.h"

#include <functional>

/// @class CExpertsEstimatesHolder
/// @brief Experts estimates holder class.
/// @respons For storing all estimates. Provides interface for calculation mean weights based on all estimates.
class CExpertsEstimatesHolder
{
   /// @brief Typedef for weights calculator functor.
   using WeightsCalculationFunctor = std::function<std::vector<Value>(const CCompressedCompareMatrix&)>;

public:
   /// @brief Default constructor.
   CExpertsEstimatesHolder() = default;

   /// @brief Adds estimate of expert and his qualification rate.
   /// @param i_estimate in, Any input object that allows to create and store CCompressedCompareMatrix.
   /// @param i_expertRate in, Qualification rate of an expert. Will be used as weight for geom. mean in alternatives
   ///        weights calculation.
   template<class T>
   void AddEstimate(T&& i_estimate, double i_expertRate)
   {
      m_estimates.emplace_back(std::forward<T>(i_estimate));
      m_expertsRates.emplace_back(i_expertRate);
   }

   /// @brief Returns mean alternatives weights based on all expert estimates.
   [[nodiscard]] std::vector<Value> CalculateMeanWeights(const WeightsCalculationFunctor& i_calculator) const;

private:
   std::vector<CCompressedCompareMatrix> m_estimates; ///< Collection of all experts estimates.
   std::vector<double> m_expertsRates; ///< Collection of all experts rates.
};
