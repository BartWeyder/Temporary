#pragma once

#include <string>
#include <vector>

/// @brief Represents record - vector of strings (attributes and last element - class).
using Example = std::vector<std::string>;

class ValueHolder
{
public:
   /// @brief Returns class by passed attributes values.
   virtual const std::string GetValue(const Example& i_experiment) const = 0;

   /// @brief Returns nodes count.
   virtual size_t GetNodesCount() const = 0;
};

