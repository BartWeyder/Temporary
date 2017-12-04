@Test
public void test_1() {
calendar.set(2018, 03, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 5.34) < 1e-10);
}
@Test
public void test_2() {
calendar.set(2018, 09, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 35) < 1e-10);
}
@Test
public void test_3() {
calendar.set(2018, 01, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 70.03) < 1e-10);
}
@Test
public void test_4() {
calendar.set(2018, 10, 01);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.56) < 1e-10);
}
@Test
public void test_5() {
calendar.set(2018, 01, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.625) < 1e-10);
}
@Test
public void test_6() {
calendar.set(2018, 01, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 55.4905) < 1e-10);
}
@Test
public void test_7() {
calendar.set(2018, 10, 01);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 85.61) < 1e-10);
}
@Test
public void test_8() {
calendar.set(2018, 01, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.31) < 1e-10);
}
@Test
public void test_9() {
calendar.set(2018, 09, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 219) < 1e-10);
}
@Test
public void test_10() {
calendar.set(2018, 01, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 464.36) < 1e-10);
}
@Test
public void test_11() {
calendar.set(2018, 09, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 746.35) < 1e-10);
}
@Test
public void test_12() {
calendar.set(2018, 01, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 725.01) < 1e-10);
}
