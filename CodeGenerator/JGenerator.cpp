#include "stdafx.h"
#include "JGenerator.h"
#include <iostream>
#include <fstream> 
#include <string>

JGenerator::JGenerator(list<TestObject> tests)
{
	string file_name = "test2.java";
	ofstream code_file(file_name);
	for (auto& test : tests)
	{
		code_file << "@Test" << endl;
		code_file << "public void test_" << test.test_number << "() {" << endl;
		code_file << "calendar.set(" << test.yy << ", " << test.mm << ", " << test.dd << ");" << endl;
		code_file << "Order order = new Order();" << endl;
		code_file << "order.addOrderItem(new OrderItem(ProductType." << test.product_type << ", 1, " << test.price << ", " << test.gift_wrap << "));" << endl;
		code_file << "order.setDate(calendar.getTime());" << endl;
		code_file << "order.setShipment(ShipmentType." << test.shipping << ");" << endl;
		code_file << "double totalDeposit = new TotalDeposit(order).getTotalDeposit();" << endl;
		//additioanal line
		code_file << "System.out.println(totalDeposit);" << endl;
		code_file << "assertTrue(Math.abs(totalDeposit - " << test.total_deposit << ") < 1e-2);" << endl;
		code_file << "}" << endl;
	}
	code_file.close();
}

JGenerator::~JGenerator()
{
}
