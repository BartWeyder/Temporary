#include "stdafx.h"
#include "test_object_extended.h"

test_object_extended::test_object_extended(std::string input)
{

	size_t begin_pos = 0;
	size_t coma_pos = 0;
	// number
	coma_pos = input.find(delimeter, 0);
	//product type
	begin_pos = coma_pos + 1;
	coma_pos = input.find(delimeter, begin_pos);
	auto temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	if (temp_buff == "books")
		product_type = "BOOKS";
	else if (temp_buff == "clothing & accessories")
		product_type = "CLOTHING";
	else if (temp_buff == "Consumer Electronics")
		product_type = "ELECTRONICS";
	else if (temp_buff == "Furniture & Decor")
		product_type = "FURNITUREDECOR";
	else if (temp_buff == "Jewelry")
		product_type = "JEWELRY";
	else if (temp_buff == "Music")
		product_type = "MUSIC";
	else if (temp_buff == "Video")
		product_type = "VIDEO";
	else if (temp_buff == "Watches")
		product_type = "WATCHES";
	else
		product_type = "999";
	//price;
	begin_pos = coma_pos + 1;
	coma_pos = input.find(delimeter, begin_pos);
	price = input.substr(begin_pos, coma_pos - begin_pos);
	// shipping
	begin_pos = coma_pos + 1;
	coma_pos = input.find(delimeter, begin_pos);
	temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	if (temp_buff == "Domestic Standart")
		shipping = "DOMESTIC";
	else if (temp_buff == "Domestic Explinted")
		shipping = "DOMESTIC_EXPEDITED";
	else if (temp_buff == "International Standart")
		shipping = "INTERNATIONAL";
	else if (temp_buff == "International Explinted")
		shipping = "INTERNATIONAL_EXPEDITED";
	else
		shipping = "999";
	
	//date
	begin_pos = coma_pos + 1;
	coma_pos = input.find(delimeter, begin_pos);
	temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	size_t date_begin = 0;
	size_t date_dot;
	//day
	date_dot = temp_buff.find('.', date_begin);
	dd = temp_buff.substr(date_begin, date_dot - date_begin);
	if (dd[0] == '0')
	{
		char temp = dd[1];
		dd = temp;
	}
	//month
	date_begin = date_dot + 1;
	date_dot = temp_buff.find('.', date_begin);
	mm = temp_buff.substr(date_begin, date_dot - date_begin);
	if (mm[0] == '0')
	{
		auto temp = mm[1];
		mm = temp;
	}
	//year
	date_begin = date_dot + 1;
	date_dot = temp_buff.find('.', date_begin);
	yy = temp_buff.substr(date_begin, date_dot - date_begin);
	// giftwrap
	begin_pos = coma_pos + 1;
	coma_pos = input.find(delimeter, begin_pos);
	temp_buff = input.substr(begin_pos, coma_pos - begin_pos);
	if (temp_buff == "FALSE" || temp_buff == "false")
		gift_wrap = "false";
	else
		gift_wrap = "true";
	//quantity
	begin_pos = coma_pos + 1;
	coma_pos = input.find(delimeter, begin_pos);
	quantity = input.substr(begin_pos, coma_pos - begin_pos);
	//skip delivery, gift, ref fee, clos fee
	for (size_t i = 0; i < 4; i++)
	{
		begin_pos = coma_pos + 1;
		coma_pos = input.find(delimeter, begin_pos);
	}
	//total
	begin_pos = coma_pos + 1;
	coma_pos = input.find(delimeter, begin_pos);
	total_deposit = input.substr(begin_pos, coma_pos - begin_pos);
}

test_object_extended::~test_object_extended()
{
}
