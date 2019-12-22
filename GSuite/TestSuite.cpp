#include "stdafx.h"
#include "TestSuite.h"
#include <limits>

namespace
{
   static constexpr auto dummySize = /*std::numeric_limits<std::int32_t>::max()*/ 4000000;
}

namespace GSuite
{
   TestSuite::TestSuite(const std::string & i_path) : m_path(i_path)
   {
      const auto size = TestCasesCount();
      auto dummy = []()
      {
         size_t value = 0;
         for (size_t i = 0; i < dummySize; i++)
         {
            value += i;
         }
         return static_cast<bool>(value);
      };

      auto dummyForSmall = []()
      {
         size_t value = 0;
         const auto dummySize = std::numeric_limits<std::int32_t>::max();
         for (size_t i = 0; i < dummySize; i++)
         {
            value += i;
         }
         for (size_t i = 0; i < dummySize; i++)
         {
            value += i;
         }
         return static_cast<bool>(value);
      };

      if (m_path == "SmallSuite.dll") m_tests = Tests(size, dummyForSmall);
      else m_tests = Tests(size, dummy);
   }

   size_t TestSuite::TestCasesCount() const
   {
      if (m_path == "Spread.dll") return 1245;
      if (m_path == "SmallSuite.dll") return 3;
      return 0;
   }
}
