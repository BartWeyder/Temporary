#pragma once
#include "ValueHolder.h"

class SimpleID3Node : public ValueHolder
{
public:
   SimpleID3Node(std::string i_answer) : m_answer(i_answer) { }
   ~SimpleID3Node() = default;

   /// Inherited via ValueHolder
   virtual const std::string GetValue(const Example & /*i_experiment*/) const override { return m_answer; }

   /// Inherited via ValueHolder
   virtual size_t GetNodesCount() const override { return 0; };

private:
   std::string m_answer;
};

