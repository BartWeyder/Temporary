#include "stdafx.h"
#include "CppUnitTest.h"
#include "ID3Node.h"
#include "ID3Utils.h"
#include "SimpleID3Node.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace
{
   using ChildNodes = std::unordered_map<std::string, std::shared_ptr<ValueHolder>>;

   /// @brief Returns tree from example 
   /// @see https://miro.medium.com/max/661/0*DX1px-z340TgpXTN.png
   ID3Node getOracleTree()
   {
      // Build branches for Outlook:
      //    Build "Sunny" branch, windy attribute:
      ChildNodes sunny
      {
         {"False", std::make_shared<SimpleID3Node>("Yes")},
         {"True", std::make_shared<SimpleID3Node>("No")}
      };
      //    Build "Rainy" brach, humidity attribute:
      ChildNodes rainy
      {
         {"High", std::make_shared<SimpleID3Node>("No")},
         {"Normal", std::make_shared<SimpleID3Node>("Yes")}
      };
      ChildNodes root
      {
         {"Sunny", std::make_shared<ID3Node>(sunny, 3)},
         {"Rainy", std::make_shared<ID3Node>(rainy, 2)},
         {"Overcast", std::make_shared<SimpleID3Node>("Yes")}
      };

      return { root, 0 };
   }
}

namespace ID3Tests
{
   TEST_CLASS(ID3MainTests)
   {
   public:
      const AttributeColumn outlook
      {
         "Rainy", "Rainy", "Overcast", "Sunny", "Sunny", "Sunny", "Overcast", "Rainy",
         "Rainy", "Sunny", "Rainy", "Overcast", "Overcast", "Sunny"
      };

      const AttributeColumn Temp
      { "Hot", "Hot", "Hot", "Mid", "Cool", "Cool", "Cool", "Mid", "Cool", "Mid", "Mid", "Mid", "Hot", "Mid" };

      const AttributeColumn humidity
      {
         "High", "High", "High", "High", "Normal", "Normal", "Normal", "High", "Normal", "Normal", "Normal", "High",
         "Normal", "High"
      };

      const AttributeColumn windy
      {
         "False", "True", "False", "False", "False", "True", "True", "False", "False", "False", "True", "True",
         "False", "True"
      };
      const AttributeColumn result
      { "No", "No", "Yes", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No" };

      const Examples examples{ outlook, Temp, humidity, windy, result };

      const Attributes attributes{ 0,1,2,3 };

      TEST_METHOD(CheckGainCalculation)
      {
         // INIT
         const std::map<size_t, double> oracleGains{ {0, 0.247}, {1, 0.029}, {2, 0.152}, {3, 0.048} };
         constexpr size_t oracleBestAttribute = 0;

         // ACT
         const auto gains = ID3Utils::GetGains(examples, attributes);
         const auto bestAttribute = ID3Utils::GetBestAttribute(examples, attributes);

         // ASSERT
         Assert::AreEqual(oracleGains.size(), gains.size());
         Assert::IsTrue(std::equal(oracleGains.begin(), oracleGains.end(), gains.begin(),
            [](const auto& i_lhs, const auto& i_rhs)
         {
            return i_lhs.first == i_rhs.first && std::abs(i_lhs.second - i_rhs.second) <= 0.001;
         }));
         Assert::AreEqual(oracleBestAttribute, bestAttribute);
      }

      TEST_METHOD(CheckTestExample)
      {
         // INIT
         ID3Node tree{ examples, attributes };
         const auto oracle = getOracleTree();

         // ACT/ASSERT
         Assert::AreEqual(oracle.GetNodesCount(), tree.GetNodesCount());
         // next asserts will use examples with only parameters that tree shall use to determine class
         Example example{ "Sunny", "", "", "False" };
         Assert::IsTrue("Yes" == oracle.GetValue(example));
         Assert::IsTrue("Yes" == tree.GetValue(example));

         example = { "Sunny", "", "", "True" };
         Assert::IsTrue("No" == oracle.GetValue(example));
         Assert::IsTrue("No" == tree.GetValue(example));

         example = { "Rainy", "", "High", "" };
         Assert::IsTrue("No" == oracle.GetValue(example));
         Assert::IsTrue("No" == tree.GetValue(example));

         example = { "Rainy", "", "Normal", "" };
         Assert::IsTrue("Yes" == oracle.GetValue(example));
         Assert::IsTrue("Yes" == tree.GetValue(example));

         example = { "Overcast", "", "", "" };
         Assert::IsTrue("Yes" == oracle.GetValue(example));
         Assert::IsTrue("Yes" == tree.GetValue(example));
      }

   };
}