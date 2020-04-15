/// @file IdeallyConsistentMatrixFactory.cpp
/// @brief Holds CIdeallyConsistentMatrixFactory class definition.
/// @author Yevhenii Kizim
/// @date 4/11/2020

#include "IdeallyConsistentMatrixFactory.h"

#include <algorithm>

namespace 
{
   /// @brief Zero numeric value checker.
   bool isNotZero(const Value& i_value) { return i_value != 0; }

   /// @brief Function for adjusting rollers that are to the right from the one we incremented.
   /// @param i_begin in, Iterator on the roller that is next (to the right) to roller that we incremented.
   ///                    This roller and further ones will be set to index on first non-zero after incremented one.
   /// @param i_end in, End-iterator of rollers.
   /// @param i_nextRawDataValueIt in, Pointer on next value after one that incremented roller points on.
   /// @param i_rawData in, Reference to the vector of raw PCM data.
   /// @return True if rollers adjusted successfully, false otherwise (e.g. reached last index).
   template<class RollerIt, class DataIt>
   bool adjustRollers(RollerIt i_begin, const RollerIt i_end,
      DataIt i_nextRawDataValueIt, const std::vector<Value>& i_rawData)
   {
      for (; i_begin != i_end; ++i_begin)
      {
         i_nextRawDataValueIt = std::find_if(i_nextRawDataValueIt, i_rawData.end(), isNotZero);
         if (std::distance(i_begin, i_end) > std::distance(i_nextRawDataValueIt, i_rawData.end())) return false;
         *i_begin = std::distance(i_rawData.begin(), i_nextRawDataValueIt);
         ++i_nextRawDataValueIt;
      }
      return true;
   }

   /// @brief Increments (rolls index to next non-zero value) specified roller.
   /// @param io_rollerIt in-out, Reverse iterator on roller that we need to increment.
   /// @param io_rollers in-out, Reference to vector of all rollers.
   /// @param i_rawData in, Reference to the vector of raw PCM data.
   /// @return True if roller incremented successfully, false otherwise
   ///         (e.g. we reached max index, need to increment roller to the left).
   template<class ReverseIt>
   bool incrementRollerValue(ReverseIt io_rollerIt, std::vector<size_t>& io_rollers, const std::vector<Value>& i_rawData)
   {
      if (io_rollerIt == io_rollers.rend()) return false;

      const auto nextNonZeroValueIt = std::find_if(i_rawData.begin() + *io_rollerIt + 1, i_rawData.end(), isNotZero);
      if (nextNonZeroValueIt == i_rawData.end()) return incrementRollerValue(++io_rollerIt, io_rollers, i_rawData);

      *io_rollerIt = std::distance(i_rawData.begin(), nextNonZeroValueIt);
      if (!adjustRollers(io_rollerIt.base(), io_rollers.end(), nextNonZeroValueIt + 1, i_rawData))
      {
         return incrementRollerValue(++io_rollerIt, io_rollers, i_rawData);
      }

      return true;
   }
}

////////////////////////////////////////////////////////////////////////////////
CIdeallyConsistentMatrixFactory::CIdeallyConsistentMatrixFactory(const CCompressedCompareMatrix& i_originalMatrix)
   : m_originalMatrix(i_originalMatrix)
   , m_currentCombination(i_originalMatrix.Dimension() - 1)
{
   if (!i_originalMatrix.IsConnected()) throw std::logic_error("Cannot generate ideal PCM from not connected matrix.");

   // init default combination
   const auto& originalData = m_originalMatrix.Data();
   auto nonZeroElem = std::find_if(originalData.begin(), originalData.end(), isNotZero);

   for (auto& combIndex : m_currentCombination)
   {
      // add index of element from original data
      _ASSERT(nonZeroElem != originalData.end());
      combIndex = std::distance(originalData.begin(), nonZeroElem);

      // find next non-zero element for next iteration
      nonZeroElem = std::find_if(nonZeroElem + 1, originalData.end(), isNotZero);
   }
}

////////////////////////////////////////////////////////////////////////////////
std::optional<CCompressedCompareMatrix> CIdeallyConsistentMatrixFactory::GetNext()
{
   if (m_currentCombination.empty()) return std::nullopt;

   // fill missing values
   CCompressedCompareMatrix idealMatrix(getRawDataFromCombination());
   for (size_t row = 0; row < idealMatrix.Dimension(); ++row)
   {
      for (auto column = row + 1; column < idealMatrix.Dimension(); ++column)
      {
         // find zero-element
         if (idealMatrix.Get(row, column) != 0) continue;

         for (size_t i = 0; i < idealMatrix.Dimension(); ++i)
         {
            // find "ways" to "departure" and "destination" points
            if (i == row) continue;

            // find "way" to "departure point" (row value of zero element)
            const auto wayToDep = idealMatrix.Get(i, row);
            if (wayToDep == 0) continue;

            // find "way" to destination point
            const auto wayToDest = idealMatrix.Get(i, column);
            if (wayToDest == 0) continue;

            // we found value, set it and search for next zero value
            idealMatrix.Set(row, column, wayToDest / wayToDep);
            break;
         }
      }
   }

   if (!generateNewCombination())
   {
      m_currentCombination.clear();
   }

   // return
   return idealMatrix;
}

////////////////////////////////////////////////////////////////////////////////
bool CIdeallyConsistentMatrixFactory::generateNewCombination()
{
   CCompressedCompareMatrix validationMatrix(m_originalMatrix.Dimension());

   do
   {
      if(!incrementRollerValue(m_currentCombination.rbegin(), m_currentCombination, m_originalMatrix.Data()))
      {
         return false;
      }

      validationMatrix = CCompressedCompareMatrix(getRawDataFromCombination());
   }
   while (!validationMatrix.IsConnected());

   return true;
}

////////////////////////////////////////////////////////////////////////////////
std::vector<Value> CIdeallyConsistentMatrixFactory::getRawDataFromCombination() const
{
   const auto& originalData = m_originalMatrix.Data();
   std::vector<Value> rawData(originalData.size());
   for (const auto& index : m_currentCombination)
   {
      rawData[index] = originalData[index];
   }
   return rawData;
}
