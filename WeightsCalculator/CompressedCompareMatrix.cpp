/// @file CompressedCompareMatrix.cpp
/// @brief Holds CCompressedCompareMatrix class definition.
/// @author Yevhenii Kizim
/// @date 4/11/2020

#include "CompressedCompareMatrix.h"

#include <set>

////////////////////////////////////////////////////////////////////////////////
CCompressedCompareMatrix& CCompressedCompareMatrix::operator=(CCompressedCompareMatrix&& i_other) noexcept
{
   if (this != &i_other)
   {
      std::swap(m_orderedUpperPartValues, i_other.m_orderedUpperPartValues);
      std::swap(m_dimension, i_other.m_dimension);
   }
   return *this;
}

////////////////////////////////////////////////////////////////////////////////
CCompressedCompareMatrix& CCompressedCompareMatrix::operator=(const CCompressedCompareMatrix& i_other)
{
   if (this != &i_other)
   {
      auto matrix(i_other);
      std::swap(*this, matrix);
   }
   return *this;
}

////////////////////////////////////////////////////////////////////////////////
Value CCompressedCompareMatrix::Get(const size_t i_row, const size_t i_column) const
{
   if (i_row == i_column) return 1.;

   // upper triangle
   if (i_row < i_column)
   {
      return m_orderedUpperPartValues[getCompressedIndex(i_row, i_column)];
   }

   // lower triangle
   const auto invertedValue = Get(i_column, i_row);
   return invertedValue == 0 ? invertedValue : 1 / invertedValue;
}

////////////////////////////////////////////////////////////////////////////////
void CCompressedCompareMatrix::Set(const size_t i_row, const size_t i_column, const Value i_value)
{
   if (i_row == i_column) throw std::logic_error("You can't modify diagonal.");
   if (i_row > i_column) Set(i_column, i_row, i_value == 0 ? i_value : 1 / i_value);

   m_orderedUpperPartValues[getCompressedIndex(i_row, i_column)] = i_value;
}

////////////////////////////////////////////////////////////////////////////////
bool CCompressedCompareMatrix::IsConnected() const
{
   std::set<size_t> indices;
   for (size_t row = 0; row < m_dimension; ++row)
   {
      for (auto column = row + 1; column < m_dimension; ++column)
      {
         const auto value = Get(row, column);
         if (value != 0)
         {
            indices.emplace(row);
            indices.emplace(column);
         }
         if (indices.size() == m_dimension) return true;
      }
   }
   return false;
}

////////////////////////////////////////////////////////////////////////////////
bool CCompressedCompareMatrix::IsFull() const
{
   return std::find(m_orderedUpperPartValues.begin(), m_orderedUpperPartValues.end(), 0.) ==
      m_orderedUpperPartValues.end();
}

////////////////////////////////////////////////////////////////////////////////
std::vector<Value> CCompressedCompareMatrix::GetRow(const size_t i_rowIndex) const
{
   std::vector<Value> row(m_dimension, 0.);
   for (size_t columnIndex = 0; columnIndex < m_dimension; ++columnIndex)
   {
      row[columnIndex] = Get(i_rowIndex, columnIndex);
   }
   return row;
}

////////////////////////////////////////////////////////////////////////////////
std::vector<Value> CCompressedCompareMatrix::GetColumn(const size_t i_columnIndex) const
{
   std::vector<Value> column(m_dimension, 0.);
   for (size_t rowIndex = 0; rowIndex < m_dimension; ++rowIndex)
   {
      column[rowIndex] = Get(rowIndex, i_columnIndex);
   }
   return column;
}

////////////////////////////////////////////////////////////////////////////////
size_t CCompressedCompareMatrix::getCompressedIndex(const size_t i_row, const size_t i_column) const
{
   size_t offset = 0;
   for (size_t i = 0; i < i_row; ++i)
   {
      offset += m_dimension - (i + 1);
   }

   const auto distanceFromDiagonal = i_column - i_row;
   // -1 because we use distance and not index relative to the matrix diagonal.
   // E.g. first element after diagonal will have column index==0 relative to the diagonal itself.
   return offset + distanceFromDiagonal - 1;
}

////////////////////////////////////////////////////////////////////////////////
size_t CCompressedCompareMatrix::getDimension() const
{
   const auto dimension = (1 + std::sqrt(1. + 4 * 2 * m_orderedUpperPartValues.size())) / 2.;
   const size_t rounded = std::lround(dimension);
   if (std::abs(dimension - rounded) > 1.e-7)
   {
      throw std::logic_error("Number of values is invalid: you need to pass exactly number of upper triangle values");
   }
   return rounded;
}
