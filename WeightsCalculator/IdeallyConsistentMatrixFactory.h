/// @file IdeallyConsistentMatrixFactory.h
/// @brief Holds CIdeallyConsistentMatrixFactory class declaration.
/// @author Yevhenii Kizim
/// @date 4/11/2020

#pragma once

#include "CompressedCompareMatrix.h"

#include <optional>

/// @class CIdeallyConsistentMatrixFactory
/// @brief Generates ideally consistent matrices from provided original. Gives ideal PCM by request, does not generate
///        all combinations at once.
class CIdeallyConsistentMatrixFactory
{
public:
   /// @brief The constructor.
   /// @param i_originalMatrix in, Original compressed PCM from which factory will produce ideally consistent PCMs.
   explicit CIdeallyConsistentMatrixFactory(const CCompressedCompareMatrix& i_originalMatrix);

   /// @brief Returns ideally consistent PCM, generates new combination for next call.
   std::optional<CCompressedCompareMatrix> GetNext();

private:
   /// @brief Utility function that responds for generation of combinations of minimum required elements to restore
   ///        ideally consistent PCM from.
   bool generateNewCombination();

   /// @brief Creates and returns vector of raw data that can be used to create CCompressedCompareMatrix.
   ///        Uses only values from combination, other values equal to zero.
   [[nodiscard]] std::vector<Value> getRawDataFromCombination() const;

   CCompressedCompareMatrix m_originalMatrix; ///< Stores original PCM.

   /// @brief Stores current combination of [Dimension - 1] indices of compressed data vector of original PCM.
   /// @remark We represent combination as mechanical roller counter: each number - is a roller of raw data indices values.
   ///         That means that combinations will go like that (for 6 elements raw data vector, skipping duplicates):
   ///         ... [0 3 4], [0 3 5], [0 4 5], [1 2 3], [1 2 4], ...
   std::vector<size_t> m_currentCombination;
};
