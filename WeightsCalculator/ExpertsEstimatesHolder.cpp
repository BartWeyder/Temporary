/// @file ExpertsEstimatesHolder.cpp
/// @brief Holds CExpertsEstimatesHolder class definition.
/// @author Yevhenii Kizim
/// @date 4/12/2020

#include "ExpertsEstimatesHolder.h"

#include <algorithm>
#include <numeric>

namespace 
{
   /// @brief Safely compares two floating point values.
   bool safeEq(const Value i_first, const Value i_second)
   {
      return std::abs(i_first - i_second) < 1e-7;
   }
}

////////////////////////////////////////////////////////////////////////////////
std::vector<Value> CExpertsEstimatesHolder::CalculateMeanWeights(const WeightsCalculationFunctor& i_calculator) const
{
   _ASSERT(m_estimates.size() == m_expertsRates.size());
   if (m_estimates.empty()) return {};

   if (!safeEq(std::accumulate(m_expertsRates.begin(), m_expertsRates.end(), 0.), 1.))
   {
      throw std::logic_error("Sum of coefficients of experts qualifications < 1. Maybe forgot to add an expert?");
   }

   // here we perform weighted geometry mean for each expert's weight
   std::vector<Value> results(m_estimates.begin()->Dimension());

   for (size_t i = 0; i < m_estimates.size(); ++i)
   {
      auto weights = i_calculator(m_estimates[i]);

      // take ln and multiply by qualification coefficient for current expert
      std::for_each(weights.begin(), weights.end(),
         [this, i](auto& i_elem) { i_elem = std::log(i_elem) * m_expertsRates[i]; });

      // add weights to result
      std::transform(results.begin(), results.end(), weights.begin(), results.begin(), std::plus<>());
   }

   // take exponent of each sum value
   std::for_each(results.begin(), results.end(), [](auto& i_elem) { i_elem = std::exp(i_elem); });

   // we may lost normalization due to rounding errors, normalize one extra time if needed.
   const auto weightsSum = std::accumulate(results.begin(), results.end(), 0.);
   if (!safeEq(1., weightsSum))
   {
      std::for_each(results.begin(), results.end(), [weightsSum](auto& i_elem) { i_elem /= weightsSum; });
   }

   return results;
}
