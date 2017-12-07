#include "stdafx.h"
#include "white_test_generator.h"
#include <fstream>

using namespace std;

white_test_generator::white_test_generator(std::list<test_order> orders)
{
	const string file_name = "whiteTest.java";
	ofstream code_file(file_name);
	for (auto& order : orders)
	{
		code_file << "@Test" << endl;
		code_file << "public void test_" << order.number << "() {" << endl;
		code_file << "calendar.set(20" << order.test_object_list.back().yy << ", " 
			<< (stoi(order.test_object_list.back().mm) - 1) << ", " 
			<< order.test_object_list.back().dd << ");" << endl;
		code_file << "Order order = new Order();" << endl;
		if (order.test_object_list.back().shipping == "999")
			code_file << "order.setShipment(" << order.test_object_list.back().shipping << ");" << endl;
		else
			code_file << "order.setShipment(ShipmentType." << order.test_object_list.back().shipping << ");" << endl;
		for (auto& object : order.test_object_list)
		{
			order.total_price += stoi(object.total_deposit);
			if (object.product_type == "999")
				code_file << "order.addOrderItem(new OrderItem(" << object.product_type << ", "
					<< object.quantity << ", " << object.price << ", " << object.gift_wrap << "));" << endl;
			else 
				code_file << "order.addOrderItem(new OrderItem(ProductType." << object.product_type << ", "
					<< object.quantity << ", " << object.price << ", " << object.gift_wrap << "));" << endl;
		}
		code_file << "order.setDate(calendar.getTime());" << endl;
		code_file << "double totalDeposit = new TotalDeposit(order).getTotalDeposit();" << endl;
		//additioanal line
		code_file << "System.out.println(totalDeposit);" << endl;
		code_file << "assertTrue(Math.abs(totalDeposit - " << order.total_price << ") < 1e-2);" << endl;
		code_file << "}" << endl;
	}
}

white_test_generator::~white_test_generator()
{
}
