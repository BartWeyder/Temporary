@Test
public void test_1() {
calendar.set(18, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
order.setDate(calendar.getTime());
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 397) < 1e-2);
}
@Test
public void test_2() {
calendar.set(08, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 465) < 1e-2);
}
@Test
public void test_3() {
calendar.set(18, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 100, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 82) < 1e-2);
}
@Test
public void test_4() {
calendar.set(18, 0, 2);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 100, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 90) < 1e-2);
}
@Test
public void test_5() {
calendar.set(18, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 65) < 1e-2);
}
@Test
public void test_6() {
calendar.set(08, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 100, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 108) < 1e-2);
}
@Test
public void test_7() {
calendar.set(18, 0, 1);
Order order = new Order();
order.setShipment(999);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 111, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 93) < 1e-2);
}
@Test
public void test_8() {
calendar.set(18, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24) < 1e-2);
}
@Test
public void test_9() {
calendar.set(18, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 64) < 1e-2);
}
@Test
public void test_10() {
calendar.set(18, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(999, 1, 666, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 665) < 1e-2);
}
@Test
public void test_11() {
calendar.set(18, 0, 1);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 111, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 92) < 1e-2);
}
@Test
public void test_12() {
calendar.set(18, 0, 2);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 112, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 109) < 1e-2);
}
@Test
public void test_13() {
calendar.set(18, 0, 3);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 113, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 140) < 1e-2);
}
@Test
public void test_14() {
calendar.set(18, 0, 4);
Order order = new Order();
order.setShipment(999);
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 114, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 95) < 1e-2);
}
@Test
public void test_15() {
calendar.set(18, 0, 5);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 111, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 158) < 1e-2);
}
@Test
public void test_16() {
calendar.set(18, 0, 6);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 112, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 93) < 1e-2);
}
@Test
public void test_17() {
calendar.set(18, 0, 7);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 113, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 94) < 1e-2);
}
@Test
public void test_18() {
calendar.set(18, 0, 8);
Order order = new Order();
order.setShipment(999);
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 114, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 95) < 1e-2);
}
@Test
public void test_19() {
calendar.set(18, 0, 9);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 115, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 143) < 1e-2);
}
@Test
public void test_20() {
calendar.set(18, 0, 10);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 116, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 97) < 1e-2);
}
@Test
public void test_21() {
calendar.set(18, 0, 11);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 117, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 98) < 1e-2);
}
@Test
public void test_22() {
calendar.set(18, 0, 12);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 118, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 114) < 1e-2);
}
@Test
public void test_23() {
calendar.set(18, 0, 13);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 119, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 98) < 1e-2);
}
@Test
public void test_24() {
calendar.set(18, 0, 14);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 120, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 99) < 1e-2);
}
@Test
public void test_25() {
calendar.set(18, 0, 15);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 121, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 115) < 1e-2);
}
@Test
public void test_26() {
calendar.set(18, 0, 16);
Order order = new Order();
order.setShipment(999);
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 122, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 102) < 1e-2);
}
@Test
public void test_27() {
calendar.set(18, 0, 17);
Order order = new Order();
order.setShipment(999);
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 123, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 97) < 1e-2);
}
@Test
public void test_28() {
calendar.set(18, 0, 18);
Order order = new Order();
order.setShipment(ShipmentType.INTERNATIONAL);
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 24, true));
order.setDate(calendar.getTime());
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, true));
order.setDate(calendar.getTime());
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 551) < 1e-2);
}
@Test
public void test_29() {
calendar.set(18, 0, 18);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 2) < 1e-2);
}
@Test
public void test_30() {
calendar.set(18, 0, 19);
Order order = new Order();
order.setShipment(ShipmentType.DOMESTIC);
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 400, false));
order.setDate(calendar.getTime());
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 336) < 1e-2);
}
