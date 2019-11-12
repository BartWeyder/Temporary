#include "stdafx.h"
#include "CppUnitTest.h"
#include "ID3Node.h"
#include "ID3Utils.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace
{
   /// @brief Returns tree from example
   /// @see https://miro.medium.com/max/661/0*DX1px-z340TgpXTN.png
   ID3Node getOracleTree()
   {
      // Build branches for Outlook:
      //    Build "Sunny" branch, windy attribute:
      ChildNodes sunny
      {
         {"False", "Yes"},
         { "True", "No"}
      };
      //    Build "Rainy" brach, humidity attribute:
      ChildNodes rainy
      {
         {"High", "No"},
         {"Normal", "Yes"}
      };
      ChildNodes root
      {
         {"Sunny", ID3Node(sunny, 3)},
         {"Rainy", ID3Node(rainy, 2)},
         {"Overcast", "Yes"}
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

      //TEST_METHOD(TestZeroGains)
      //{
      //   // INIT
      //   const Examples examples{ {"True", "False"}, {"Class1", "Class2"} };

      //   // ACT/ASSERT
      //   auto f = [&examples]()
      //   {
      //      ID3Utils::GetBestAttribute(examples, { 0 });
      //   };
      //   Assert::ExpectException<std::logic_error>(f);
      //}

      TEST_METHOD(CheckTestExample)
      {
         // INIT
         ID3Node tree{ examples, attributes };
         const auto oracle = getOracleTree();

         // ACT/ASSERT
         Assert::AreEqual(oracle.GetChildNodesCount(), tree.GetChildNodesCount());
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