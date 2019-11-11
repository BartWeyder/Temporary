#pragma once

#include <set>
#include <map>
#include <memory>
#include <unordered_map>

#include "ValueHolder.h"

/// @brief Vector of all attribute values.
using AttributeColumn = std::vector<std::string>;
/// @brief Vector of records.
using Examples = std::vector<AttributeColumn>;
/// @brief Vector of indices, where each index - attribute.
using Attributes = std::set<size_t>;
/// @brief In our situation - it's just index.
using AttributeHeader = size_t;
/// @brief Set of unique string values.
using UniqueValues = std::set<std::string>;
/// @brief Container of all attributes and their unique values.
using UniqueAttributeValues = std::map<const AttributeHeader, const UniqueValues>;
/// @brief Shared container of all attributes and their unique values.
using UniqueAttributeValuesPtr = std::shared_ptr<const UniqueAttributeValues>;

class ID3Node : public ValueHolder
{
public:
   /// @brief The constructor. Used for internal nodes creation. Copies pointer on unique attribute values.
   /// @param i_examples in, Data set with examples.
   /// @param i_attributes in, List of all attribute headers (indices in our case).
   /// @param i_uniqueAttributeValues in, shared pointer to map of attribute index and set of its unique values.
   /// @throw std::logic_error when attributes are empty or there are less than 2 unique classes (so nothing to define).
   ID3Node(const Examples& i_examples, const Attributes& i_attributes, UniqueAttributeValuesPtr i_uniqueAttributeValues = nullptr);

   /// @brief The constructor. Used for test purposes.
   /// @param i_childNodes in, Map with child nodes.
   ID3Node(const std::unordered_map<std::string, std::shared_ptr<ValueHolder>>& i_childNodes,
      const size_t i_attribute)
      : m_childNodes(i_childNodes), m_attribute(i_attribute) { }

   ~ID3Node() = default;

   /// @brief Inherited via ValueHolder
   virtual const std::string GetValue(const Example & i_experiment) const override;

   /// @brief Inherited via ValueHolder
   virtual size_t GetNodesCount() const override;

private:
   size_t m_attribute; ///< attribute that is corresponding to this node.

   /// @brief Map of attribute-value and corresponding child node.
   std::unordered_map<std::string, std::shared_ptr<ValueHolder>> m_childNodes;

   /// Map of attribute index and set of its unique values.
   UniqueAttributeValuesPtr m_uniqueAttributeValues;
};
