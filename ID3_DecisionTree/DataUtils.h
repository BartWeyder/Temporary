#pragma once

#include "ID3Node.h"

using Row = std::vector<std::string>;
using Attribute = std::string;
using Class = std::string;
using Entries = size_t;

/// @brief Returns row from example data set by specified index.
Row GetRow(const Examples& i_examples, const size_t i_index);

/// @brief Inserts row into the end of examples data set.
void InsertRow(Examples& o_examples, const Row& i_row);

/// @brief Calculates entropy.
/// @param i_data in, This map is used in getBestAttribute method to calculate entries of each class with defined
///                   atrribute value. So to avoid copying of values in simple vector, we pass this map.
/// @return Entropy value. You can read this as Entropy(3, 2, 5, ..., 7) call.
/// @see https://medium.com/@rishabhjain_22692/decision-trees-it-begins-here-93ff54ef134 to read about entropy.
double GetEntropy(const std::unordered_map<Class, Entries> & i_data);

/// @brief Calculates gain for each attribute and returns index of attribute with the best one.
/// @param i_examples in, Set of training examples.
/// @param i_attributes in, Set of attribute indexes.
size_t GetBestAttribute(const Examples & i_examples, const Attributes & i_attributes);
