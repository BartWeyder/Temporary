#include "stdafx.h"
#include "TestObject.h"
#include <string>

TestObject::TestObject(string input)
{
	string temp_buff;
	size_t begin_pos = 0;
	size_t coma_pos = 0;
	// number
	coma_pos = input.find(';', 0);
	test_number = input.substr(begin_pos, coma_pos - begin_pos);
	// shipping
	begin_pos = coma_pos + 1;
	coma_pos = input.find(';', begin_pos);
	temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	if (temp_buff == "Domestic Standart")
		shipping = "DOMESTIC";
	if (temp_buff == "Domestic Explinted")
		shipping = "DOMESTIC_EXPEDITED";
	if (temp_buff == "International Standart")
		shipping = "INTERNATIONAL";
	if (temp_buff == "International Explinted")
		shipping = "INTERNATIONAL_EXPEDITED";
	// giftwrap
	begin_pos = coma_pos + 1;
	coma_pos = input.find(';', begin_pos);
	temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	if (temp_buff == "FALSE" || temp_buff == "false")
		gift_wrap = "false";
	else
		gift_wrap = "true";
	//product type
	begin_pos = coma_pos + 1;
	coma_pos = input.find(';', begin_pos);
	temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	if (temp_buff == "books")
		product_type = "BOOKS";
	if (temp_buff == "clothing & accessories")
		product_type = "CLOTHING";
	if (temp_buff == "Consumer Electronics")
		product_type = "ELECTRONICS";
	if (temp_buff == "Furniture & Decor")
		product_type = "FURNITUREDECOR";
	if (temp_buff == "Jewelry")
		product_type = "JEWELRY";
	if (temp_buff == "Music")
		product_type = "MUSIC";
	if (temp_buff == "Video")
		product_type = "VIDEO";
	if (temp_buff == "Watches")
		product_type = "WATCHES";

	//fee
	begin_pos = coma_pos + 1;
	coma_pos = input.find(';', begin_pos);
	temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	if (temp_buff == "Referral Fee Percentages")
		is_fee_percentage = true;
	else
		is_fee_percentage = false;
	
	//price;
	begin_pos = coma_pos + 1;
	coma_pos = input.find(';', begin_pos);
	price = input.substr(begin_pos, coma_pos - begin_pos);

	//date
	begin_pos = coma_pos + 1;
	coma_pos = input.find(';', begin_pos);
	temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	size_t date_begin = 0;
	size_t date_dot;
	//day
	date_dot = temp_buff.find('.', date_begin);
	dd = temp_buff.substr(date_begin, date_dot - date_begin);
	//month
	date_begin = date_dot + 1;
	date_dot = temp_buff.find('.', date_begin);
	mm = temp_buff.substr(date_begin, date_dot - date_begin);
	//year
	date_begin = date_dot + 1;
	date_dot = temp_buff.find('.', date_begin);
	yy = temp_buff.substr(date_begin, date_dot - date_begin);

	//total
	begin_pos = coma_pos + 1;
	coma_pos = input.find(';', begin_pos);
	total_deposit = input.substr(begin_pos, coma_pos - begin_pos);
}

TestObject::~TestObject()
{
}


