#pragma once

#include <string>
#include <vector>
#include <functional>

namespace GSuite
{
   using Tests = std::vector<std::function<bool()>>;

   class TestSuite
   {
   public:
      TestSuite(const std::string& i_path);
      ~TestSuite() = default;
      size_t TestCasesCount() const;
      const Tests& GetTestsMap() const { return m_tests; }

   private:
      const std::string m_path;
      Tests m_tests;
   };

}
