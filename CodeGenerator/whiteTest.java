@Test
public void test_1() {
calendar.set(2018, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 396.52) < 1e-2);
}
@Test
public void test_2() {
calendar.set(2008, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 465.16) < 1e-2);
}
@Test
public void test_3() {
calendar.set(2018, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 100, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 82.66) < 1e-2);
}
@Test
public void test_4() {
calendar.set(2018, 0, 2);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 100, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 90.56) < 1e-2);
}
@Test
public void test_5() {
calendar.set(2018, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 65.41) < 1e-2);
}
@Test
public void test_6() {
calendar.set(2008, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 100, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 108.01) < 1e-2);
}
@Test
public void test_8() {
calendar.set(2018, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24.3) < 1e-2);
}
@Test
public void test_9() {
calendar.set(2018, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 64.66) < 1e-2);
}
@Test
public void test_11() {
calendar.set(2018, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 111, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 92.01) < 1e-2);
}
@Test
public void test_12() {
calendar.set(2018, 0, 2);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 112, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 109.81) < 1e-2);
}
@Test
public void test_13() {
calendar.set(2018, 0, 3);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 113, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 140.21) < 1e-2);
}
@Test
public void test_15() {
calendar.set(2018, 0, 5);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 111, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 158.71) < 1e-2);
}
@Test
public void test_16() {
calendar.set(2018, 0, 6);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 112, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 93.76) < 1e-2);
}
@Test
public void test_17() {
calendar.set(2018, 0, 7);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 113, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 94.41) < 1e-2);
}
@Test
public void test_19() {
calendar.set(2018, 0, 9);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 115, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 143.26) < 1e-2);
}
@Test
public void test_20() {
calendar.set(2018, 0, 10);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 116, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 97.61) < 1e-2);
}
@Test
public void test_21() {
calendar.set(2018, 0, 11);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 117, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 98.46) < 1e-2);
}
@Test
public void test_22() {
calendar.set(2018, 0, 12);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 118, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 114.26) < 1e-2);
}
@Test
public void test_23() {
calendar.set(2018, 0, 13);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 119, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 98.81) < 1e-2);
}
@Test
public void test_24() {
calendar.set(2018, 0, 14);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 120, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 99.66) < 1e-2);
}
@Test
public void test_25() {
calendar.set(2018, 0, 15);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 121, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 115.46) < 1e-2);
}
@Test
public void test_28() {
calendar.set(2018, 0, 18);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 24, true));
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, true));
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 552.06) < 1e-2);
}
@Test
public void test_29() {
calendar.set(2018, 0, 18);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 2.05) < 1e-2);
}
@Test
public void test_30() {
calendar.set(2018, 0, 19);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 400, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 336.56) < 1e-2);
}
