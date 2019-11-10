#include "pch.h"
#include "DataUtils.h"
#include <algorithm>

namespace
{
	/// @brief Calculates addition for entropy formula.
	/// @param i_count in, count of entries in data set.
	/// @param i_sum in, size of data set.
	double calculateEntropyAddition(size_t i_count, size_t i_sum)
	{
		const auto p = static_cast<double>(i_count) / i_sum;
		return -p * log2(p);
	}
}

///////////////////////////////////////////////////////////////////////////////
Row GetRow(const Examples & i_examples, const size_t i_index)
{
	Row row;
	row.reserve(i_examples.size());
	for (auto& column : i_examples)
	{
		row.emplace_back(column[i_index]);
	}
	return row;
}

///////////////////////////////////////////////////////////////////////////////
void InsertRow(Examples & o_examples, const Row & i_row)
{
	for (size_t i = 0; i < o_examples.size(); ++i)
	{
		o_examples[i].emplace_back(i_row[i]);
	}
}

///////////////////////////////////////////////////////////////////////////////
double GetEntropy(const std::unordered_map<Class, Entries>& i_data)
{
	// Get count of all examples
	size_t sum = 0;
	std::for_each(i_data.begin(), i_data.end(), [&sum](const auto& i_element) { sum += i_element.second; });
	// Calculate entropy by formula
	auto entropy = 0.;
	for (const auto& elem : i_data)
	{
		entropy += calculateEntropyAddition(elem.second, sum);
	}
	return entropy;
}

///////////////////////////////////////////////////////////////////////////////
size_t GetBestAttribute(const Examples & i_examples, const Attributes & i_attributes)
{
	// Prepare data:
	// Get global (for result class) entropy:
	UniqueValues uniqueClasses(i_examples.rbegin()->begin(), i_examples.rbegin()->end());
	long double globalEntropy = 0.;
	for (const auto& _class : uniqueClasses)
	{
		globalEntropy += calculateEntropyAddition(
			std::count(i_examples.rbegin()->begin(), i_examples.rbegin()->end(), _class), i_examples.rbegin()->size());
	}

	// For each attribute we have map with class name and how many times this class met with this attribute.
	std::unordered_map<Attribute, std::unordered_map<Class, Entries>> dataFrame(i_attributes.size());
	// For each record:
	for (auto i = 0; i < i_examples.begin()->size(); ++i)
	{
		// For each column (attributes)
		for (const auto attrIdx : i_attributes)
		{
			const auto& exampleClass = (*i_examples.rbegin())[i]; // class of this record
			const auto& attributeValue = i_examples.at(attrIdx)[i]; // attribute value of this record
			dataFrame[attributeValue][exampleClass]++; // Increase entry for this class for current attribute
		}
	}

	std::map<std::size_t, std::set<Attribute> > uniqueAttributeValuesForEachAttribute;
	for (const auto attrIdx : i_attributes)
	{
		uniqueAttributeValuesForEachAttribute.insert(
			{ attrIdx, std::set<Attribute>(i_examples.at(attrIdx).begin(), i_examples.at(attrIdx).end()) });
	}

	// Calculate entropy for each attribute and return best one:
	size_t bestAttrIdx = *i_attributes.begin();
	auto bestAttrGain = 0.;

	for (const auto attrIdx : i_attributes) // for each attribute
	{
		auto attrEntropy = 0.;
		// for each unique value of this attribute:
		for (const auto& attributeValue : uniqueAttributeValuesForEachAttribute[attrIdx])
		{
			// how many time we met this attribute:
			const auto column = i_examples.at(attrIdx);
			const long double entries = std::count(column.begin(), column.end(), attributeValue);
			// element of sum in per-attribute entropy calculation
			//auto entries = 10;
			attrEntropy += entries / i_examples.begin()->size() * GetEntropy(dataFrame[attributeValue]);
		}

		const auto attrGain = globalEntropy - attrEntropy;
		// If this entropy is better, save it and index of attribute.
		if (attrGain > bestAttrGain)
		{
			bestAttrGain = attrGain;
			bestAttrIdx = attrIdx;
		}
	}

	return bestAttrIdx;
}
