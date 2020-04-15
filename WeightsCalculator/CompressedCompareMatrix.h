/// @file CompressedCompareMatrix.h
/// @brief Holds CCompressedCompareMatrix class declaration.
/// @author Yevhenii Kizim
/// @date 4/11/2020

#pragma once

#include <vector>

using Value = double;

/// @class CCompressedCompareMatrix
/// @brief Represents compressed matrix of pair compare. Stores only upper part as array of ordered values
///        (e.g. {m01, m02, m12} for 3x3 matrix). Uses zero-based indices.
/// @param Dimension represents dimension of PCM or in another words number of alternatives.
class CCompressedCompareMatrix
{
public:
   /// @brief The constructor.
   /// @param i_init in, Array with ordered values of upper triangle (e.g. {m01, m02, m12} for 3x3 matrix).
   /// @throw std::out_of_range exception if size of container is bigger that size of array.
   /// @throw std::logic_error exception if init size is wrong.
   template <class Vector>
   explicit CCompressedCompareMatrix(Vector&& i_init)
      : m_orderedUpperPartValues(std::forward<Vector>(i_init))
      , m_dimension(getDimension())
   {
   }

   /// @brief Constructor that initializes matrix with zeros.
   explicit CCompressedCompareMatrix(const size_t i_dimension)
      : m_orderedUpperPartValues(getStoredDataSize())
      , m_dimension(i_dimension)
   {}

   /// @brief Container-dependent constructors.
   /// @param i_init in, Container from which we need to copy elements to our array.
   /// @throw std::out_of_range exception if size of container is bigger that size of array.
   /// @throw std::logic_error exception if init size 
   explicit CCompressedCompareMatrix(std::initializer_list<double>&& i_init)
      : m_orderedUpperPartValues(i_init)
      , m_dimension(getDimension())
   {
   }

   /// @brief Copy constructor.
   CCompressedCompareMatrix(const CCompressedCompareMatrix& i_other) = default;

   /// @brief Move operator.
   CCompressedCompareMatrix(CCompressedCompareMatrix&& i_other) = default;

   /// @brief Move assignment operator.
   CCompressedCompareMatrix& operator=(CCompressedCompareMatrix&& i_other) noexcept;

   /// @brief Copy assignment operator.
   CCompressedCompareMatrix& operator=(const CCompressedCompareMatrix& i_other);

   ~CCompressedCompareMatrix() = default;

   /// @brief Returns value by row and column.
   /// @param i_row in, Cell row.
   /// @param i_column in, Cell column.
   [[nodiscard]] Value Get(size_t i_row, size_t i_column) const;

   /// @brief Sets value for specified cell.
   /// @param i_row in, Cell row.
   /// @param i_column in, Cell column.
   /// @param i_value in, Value to set.
   void Set(size_t i_row, size_t i_column, Value i_value);

   /// @brief Checks whether our matrix is fully connected (e.g. if we represent it as graph we can reach any vertex).
   [[nodiscard]] bool IsConnected() const;

   /// @brief Checks whether we have all expert compares (that we don't have zero elements).
   [[nodiscard]] bool IsFull() const;

   /// @brief Returns row as vector by index.
   [[nodiscard]] std::vector<Value> GetRow(size_t i_rowIndex) const;

   /// @brief Returns column as vector by index.
   [[nodiscard]] std::vector<Value> GetColumn(size_t i_columnIndex) const;

   /// @brief Returns const reference to raw saved data.
   [[nodiscard]] const std::vector<Value>& Data() const { return m_orderedUpperPartValues; }

   /// @brief Returns number of alternatives in matrix.
   [[nodiscard]] size_t Dimension() const { return m_dimension; }

private:
   /// @brief Returns index of value in compressed vector by cell coordinates.
   /// @param i_row in, Cell row.
   /// @param i_column in, Cell column.
   [[nodiscard]] size_t getCompressedIndex(size_t i_row, size_t i_column) const;

   /// @brief Returns minimum number of required elements to fully reproduce whole PCM.
   [[nodiscard]] size_t getStoredDataSize() const { return m_dimension * (m_dimension - 1) / 2; }

   /// @brief Calculates dimension by current stored value size.
   [[nodiscard]] size_t getDimension() const;

   /// @brief Keeps ordered upper part values (e.g. {m01, m02, m12} for 3x3 matrix).
   std::vector<Value> m_orderedUpperPartValues;

   size_t m_dimension = 0; ///< Defines how many alternatives are in our matrix.
};
