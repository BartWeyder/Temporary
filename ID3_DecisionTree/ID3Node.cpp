#include "pch.h"
#include "ID3Node.h"

#include <numeric>
#include <exception>

#include "SimpleID3Node.h"
#include "DataUtils.h"

namespace
{
	/// @brief Returns most popular value in column.
	std::string findTheMostPopular(const AttributeColumn& i_column)
	{
		UniqueValues uniqueValues(i_column.begin(), i_column.end());
		ptrdiff_t maxCount = 0;
		auto maxValue = *i_column.begin();
		for (const auto& value : uniqueValues)
		{
			const auto count = std::count(i_column.begin(), i_column.end(), value);
			if (count > maxCount)
			{
				maxCount = count;
				maxValue = value;
			}
		}
		return maxValue;
	}
}

///////////////////////////////////////////////////////////////////////////////
ID3Node::ID3Node(const Examples & i_examples, const Attributes & i_attributes,
	UniqueAttributeValuesPtr i_uniqueAttributeValues)
	: m_uniqueAttributeValues(i_uniqueAttributeValues)
{
	// Set unique attributes on root creation
	if (!m_uniqueAttributeValues)
	{
		UniqueAttributeValues map;
		for (const auto attrIdx : i_attributes)
		{
			map.insert({ attrIdx, UniqueValues(i_examples[attrIdx].begin(), i_examples[attrIdx].end()) });
		}

		m_uniqueAttributeValues = std::make_shared<const UniqueAttributeValues>(std::move(map));
	}

	// first checks zone
	if (i_attributes.empty())
	{
		throw std::logic_error("Attributes empty, return most popular class.");
	}

	UniqueValues uniqueClasses(i_examples.rbegin()->begin(), i_examples.rbegin()->end());
	if (uniqueClasses.size() <= 1)
	{
		throw std::logic_error("There is only one possible class, nothing to define...");
	}

	m_attribute = GetBestAttribute(i_examples, i_attributes);
	for (const auto& attr : m_uniqueAttributeValues->at(m_attribute))
	{
		Examples subsetOfExamples(i_examples.size());
		for (size_t i = 0; i < i_examples.begin()->size(); i++)
		{
			if (i_examples.at(m_attribute)[i] == attr)
			{
				InsertRow(subsetOfExamples, GetRow(i_examples, i));
			}
		}

		// Check if subset is empty there are only single-class examples left:
		if (subsetOfExamples.empty())
		{
			m_childNodes.insert({ attr, std::make_unique<SimpleID3Node>(findTheMostPopular(*i_examples.rbegin())) });
			continue;
		}

		Attributes childAttributes{ i_attributes };
		childAttributes.erase(m_attribute);

		try
		{
			m_childNodes.insert({ attr, std::make_unique<ID3Node>(subsetOfExamples, childAttributes, m_uniqueAttributeValues) });
		}
		catch (const std::logic_error&)
		{
			m_childNodes.insert({ attr, std::make_unique<SimpleID3Node>(findTheMostPopular(*i_examples.rbegin())) });
		}
	}
}

///////////////////////////////////////////////////////////////////////////////
const std::string ID3Node::GetValue(const Example & i_experiment) const
{
	const auto& attribute = i_experiment[m_attribute];
	return m_childNodes.at(attribute)->GetValue(i_experiment);
}
