@Test
public void test_1() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.065) < 1e-10);
}
@Test
public void test_2() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.065) < 1e-10);
}
@Test
public void test_3() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.025) < 1e-10);
}
@Test
public void test_4() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 45.575) < 1e-10);
}
@Test
public void test_5() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.065) < 1e-10);
}
@Test
public void test_6() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.065) < 1e-10);
}
@Test
public void test_7() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 30.49) < 1e-10);
}
@Test
public void test_8() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 71.84) < 1e-10);
}
@Test
public void test_9() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.53) < 1e-10);
}
@Test
public void test_10() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.33) < 1e-10);
}
@Test
public void test_11() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.5) < 1e-10);
}
@Test
public void test_12() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 71.84) < 1e-10);
}
@Test
public void test_13() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 17.33) < 1e-10);
}
@Test
public void test_14() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.54) < 1e-10);
}
@Test
public void test_15() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 76.84) < 1e-10);
}
@Test
public void test_16() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 35.49) < 1e-10);
}
@Test
public void test_17() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 17.33) < 1e-10);
}
@Test
public void test_18() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.53) < 1e-10);
}
@Test
public void test_19() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 64.85) < 1e-10);
}
@Test
public void test_20() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 48.49) < 1e-10);
}
@Test
public void test_21() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 5.34) < 1e-10);
}
@Test
public void test_22() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.54) < 1e-10);
}
@Test
public void test_23() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 89.84) < 1e-10);
}
@Test
public void test_24() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.5) < 1e-10);
}
@Test
public void test_25() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.33) < 1e-10);
}
@Test
public void test_26() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.34) < 1e-10);
}
@Test
public void test_27() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 26.29) < 1e-10);
}
@Test
public void test_28() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 67.64) < 1e-10);
}
@Test
public void test_29() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 2.54) < 1e-10);
}
@Test
public void test_30() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 8.13) < 1e-10);
}
@Test
public void test_31() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.375) < 1e-10);
}
@Test
public void test_32() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 46.925) < 1e-10);
}
@Test
public void test_33() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.415) < 1e-10);
}
@Test
public void test_34() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.615) < 1e-10);
}
@Test
public void test_35() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.375) < 1e-10);
}
@Test
public void test_36() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 46.925) < 1e-10);
}
@Test
public void test_37() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.065) < 1e-10);
}
@Test
public void test_38() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 5.265) < 1e-10);
}
@Test
public void test_39() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.025) < 1e-10);
}
@Test
public void test_40() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 45.575) < 1e-10);
}
@Test
public void test_41() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.065) < 1e-10);
}
@Test
public void test_42() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 5.265) < 1e-10);
}
@Test
public void test_43() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 22.5) < 1e-10);
}
@Test
public void test_44() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 66.84) < 1e-10);
}
@Test
public void test_45() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 2.54) < 1e-10);
}
@Test
public void test_46() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.49) < 1e-10);
}
@Test
public void test_47() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.45) < 1e-10);
}
@Test
public void test_48() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 46) < 1e-10);
}
@Test
public void test_49() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.49) < 1e-10);
}
@Test
public void test_50() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.49) < 1e-10);
}
@Test
public void test_51() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.45) < 1e-10);
}
@Test
public void test_52() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 72.34) < 1e-10);
}
@Test
public void test_53() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 11.03) < 1e-10);
}
@Test
public void test_54() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.83) < 1e-10);
}
@Test
public void test_55() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24) < 1e-10);
}
@Test
public void test_56() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 72.34) < 1e-10);
}
@Test
public void test_57() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.04) < 1e-10);
}
@Test
public void test_58() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24) < 1e-10);
}
@Test
public void test_59() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 17.83) < 1e-10);
}
@Test
public void test_60() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.04) < 1e-10);
}
@Test
public void test_61() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 65.35) < 1e-10);
}
@Test
public void test_62() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 35.99) < 1e-10);
}
@Test
public void test_63() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 5.84) < 1e-10);
}
@Test
public void test_64() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 29.03) < 1e-10);
}
@Test
public void test_65() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 65.35) < 1e-10);
}
@Test
public void test_66() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 48.99) < 1e-10);
}
@Test
public void test_67() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 30.83) < 1e-10);
}
@Test
public void test_68() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.04) < 1e-10);
}
@Test
public void test_69() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 90.34) < 1e-10);
}
@Test
public void test_70() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.84) < 1e-10);
}
@Test
public void test_71() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 26.79) < 1e-10);
}
@Test
public void test_72() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 64.35) < 1e-10);
}
@Test
public void test_73() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.83) < 1e-10);
}
@Test
public void test_74() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 8.63) < 1e-10);
}
@Test
public void test_75() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23) < 1e-10);
}
@Test
public void test_76() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 47.35) < 1e-10);
}
@Test
public void test_77() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.84) < 1e-10);
}
@Test
public void test_78() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 7.04) < 1e-10);
}
@Test
public void test_79() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.8) < 1e-10);
}
@Test
public void test_80() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 47.35) < 1e-10);
}
@Test
public void test_81() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.84) < 1e-10);
}
@Test
public void test_82() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 5.69) < 1e-10);
}
@Test
public void test_83() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.45) < 1e-10);
}
@Test
public void test_84() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 46) < 1e-10);
}
@Test
public void test_85() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.49) < 1e-10);
}
@Test
public void test_86() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 5.69) < 1e-10);
}
@Test
public void test_87() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.45) < 1e-10);
}
@Test
public void test_88() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 67.34) < 1e-10);
}
@Test
public void test_89() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.04) < 1e-10);
}
@Test
public void test_90() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 7.83) < 1e-10);
}
@Test
public void test_91() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 20.2795) < 1e-10);
}
@Test
public void test_92() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 49.8295) < 1e-10);
}
@Test
public void test_93() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 7.3195) < 1e-10);
}
@Test
public void test_94() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.3195) < 1e-10);
}
@Test
public void test_95() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 20.2795) < 1e-10);
}
@Test
public void test_96() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 49.8295) < 1e-10);
}
@Test
public void test_97() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.71) < 1e-10);
}
@Test
public void test_98() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.52) < 1e-10);
}
@Test
public void test_99() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 35.67) < 1e-10);
}
@Test
public void test_100() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 77.02) < 1e-10);
}
@Test
public void test_101() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.71) < 1e-10);
}
@Test
public void test_102() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 17.51) < 1e-10);
}
@Test
public void test_103() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 82.02) < 1e-10);
}
@Test
public void test_104() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.67) < 1e-10);
}
@Test
public void test_105() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.52) < 1e-10);
}
@Test
public void test_106() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 20.71) < 1e-10);
}
@Test
public void test_107() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 70.03) < 1e-10);
}
@Test
public void test_108() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.67) < 1e-10);
}
@Test
public void test_109() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 35.51) < 1e-10);
}
@Test
public void test_110() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 8.72) < 1e-10);
}
@Test
public void test_111() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 70.03) < 1e-10);
}
@Test
public void test_112() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 53.67) < 1e-10);
}
@Test
public void test_113() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.52) < 1e-10);
}
@Test
public void test_114() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 8.72) < 1e-10);
}
@Test
public void test_115() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 31.47) < 1e-10);
}
@Test
public void test_116() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 69.03) < 1e-10);
}
@Test
public void test_117() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 11.51) < 1e-10);
}
@Test
public void test_118() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 9.52) < 1e-10);
}
@Test
public void test_119() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 27.68) < 1e-10);
}
@Test
public void test_120() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 69.03) < 1e-10);
}
@Test
public void test_121() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 8.6695) < 1e-10);
}
@Test
public void test_122() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.8695) < 1e-10);
}
@Test
public void test_123() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 19.6295) < 1e-10);
}
@Test
public void test_124() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 51.1795) < 1e-10);
}
@Test
public void test_125() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 8.6695) < 1e-10);
}
@Test
public void test_126() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.8695) < 1e-10);
}
@Test
public void test_127() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 18.2795) < 1e-10);
}
@Test
public void test_128() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 49.8295) < 1e-10);
}
@Test
public void test_129() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 7.3195) < 1e-10);
}
@Test
public void test_130() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 9.5195) < 1e-10);
}
@Test
public void test_131() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 18.2795) < 1e-10);
}
@Test
public void test_132() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 49.8295) < 1e-10);
}
@Test
public void test_133() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.71) < 1e-10);
}
@Test
public void test_134() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 9.52) < 1e-10);
}
@Test
public void test_135() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 30.67) < 1e-10);
}
@Test
public void test_136() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 52.66) < 1e-10);
}
@Test
public void test_137() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.15) < 1e-10);
}
@Test
public void test_138() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.15) < 1e-10);
}
@Test
public void test_139() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.11) < 1e-10);
}
@Test
public void test_140() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 52.66) < 1e-10);
}
@Test
public void test_141() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.15) < 1e-10);
}
@Test
public void test_142() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 20.34) < 1e-10);
}
@Test
public void test_143() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 38.5) < 1e-10);
}
@Test
public void test_144() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 72.86) < 1e-10);
}
@Test
public void test_145() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 18.54) < 1e-10);
}
@Test
public void test_146() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 20.34) < 1e-10);
}
@Test
public void test_147() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 38.5) < 1e-10);
}
@Test
public void test_148() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24.04) < 1e-10);
}
@Test
public void test_149() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 85.35) < 1e-10);
}
@Test
public void test_150() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 44) < 1e-10);
}
@Test
public void test_151() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.85) < 1e-10);
}
@Test
public void test_152() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.05) < 1e-10);
}
@Test
public void test_153() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 73.36) < 1e-10);
}
@Test
public void test_154() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 56.5) < 1e-10);
}
@Test
public void test_155() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.35) < 1e-10);
}
@Test
public void test_156() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 11.55) < 1e-10);
}
@Test
public void test_157() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 72.86) < 1e-10);
}
@Test
public void test_158() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 31.51) < 1e-10);
}
@Test
public void test_159() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.35) < 1e-10);
}
@Test
public void test_160() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 76.15) < 1e-10);
}
@Test
public void test_161() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 11.05) < 1e-10);
}
@Test
public void test_162() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.64) < 1e-10);
}
@Test
public void test_163() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 34.8) < 1e-10);
}
@Test
public void test_164() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 76.15) < 1e-10);
}
@Test
public void test_165() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 11.05) < 1e-10);
}
@Test
public void test_166() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.7) < 1e-10);
}
@Test
public void test_167() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 22.46) < 1e-10);
}
@Test
public void test_168() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.01) < 1e-10);
}
@Test
public void test_169() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 11.5) < 1e-10);
}
@Test
public void test_170() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.7) < 1e-10);
}
@Test
public void test_171() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 22.46) < 1e-10);
}
@Test
public void test_172() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 52.66) < 1e-10);
}
@Test
public void test_173() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.15) < 1e-10);
}
@Test
public void test_174() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.35) < 1e-10);
}
@Test
public void test_175() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 21.11) < 1e-10);
}
@Test
public void test_176() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 52.66) < 1e-10);
}
@Test
public void test_177() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 10.15) < 1e-10);
}
@Test
public void test_178() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.84) < 1e-10);
}
@Test
public void test_179() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 31.01) < 1e-10);
}
@Test
public void test_180() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 72.36) < 1e-10);
}
@Test
public void test_181() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.275) < 1e-10);
}
@Test
public void test_182() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.275) < 1e-10);
}
@Test
public void test_183() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 25.235) < 1e-10);
}
@Test
public void test_184() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.785) < 1e-10);
}
@Test
public void test_185() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.275) < 1e-10);
}
@Test
public void test_186() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.275) < 1e-10);
}
@Test
public void test_187() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.625) < 1e-10);
}
@Test
public void test_188() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 81.975) < 1e-10);
}
@Test
public void test_189() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 20.665) < 1e-10);
}
@Test
public void test_190() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 22.465) < 1e-10);
}
@Test
public void test_191() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.625) < 1e-10);
}
@Test
public void test_192() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 81.975) < 1e-10);
}
@Test
public void test_193() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 28.34) < 1e-10);
}
@Test
public void test_194() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.55) < 1e-10);
}
@Test
public void test_195() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 87.85) < 1e-10);
}
@Test
public void test_196() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 46.5) < 1e-10);
}
@Test
public void test_197() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.35) < 1e-10);
}
@Test
public void test_198() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 26.54) < 1e-10);
}
@Test
public void test_199() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 99.975) < 1e-10);
}
@Test
public void test_200() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.635) < 1e-10);
}
@Test
public void test_201() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.475) < 1e-10);
}
@Test
public void test_202() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.675) < 1e-10);
}
@Test
public void test_203() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 99.975) < 1e-10);
}
@Test
public void test_204() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.635) < 1e-10);
}
@Test
public void test_205() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.84) < 1e-10);
}
@Test
public void test_206() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.85) < 1e-10);
}
@Test
public void test_207() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 36.8) < 1e-10);
}
@Test
public void test_208() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 78.15) < 1e-10);
}
@Test
public void test_209() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.84) < 1e-10);
}
@Test
public void test_210() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.05) < 1e-10);
}
@Test
public void test_211() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.625) < 1e-10);
}
@Test
public void test_212() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.825) < 1e-10);
}
@Test
public void test_213() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24.585) < 1e-10);
}
@Test
public void test_214() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 56.135) < 1e-10);
}
@Test
public void test_215() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24.585) < 1e-10);
}
@Test
public void test_216() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.825) < 1e-10);
}
@Test
public void test_217() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.275) < 1e-10);
}
@Test
public void test_218() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.475) < 1e-10);
}
@Test
public void test_219() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.235) < 1e-10);
}
@Test
public void test_220() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.785) < 1e-10);
}
@Test
public void test_221() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.785) < 1e-10);
}
@Test
public void test_222() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.785) < 1e-10);
}
@Test
public void test_223() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.54) < 1e-10);
}
@Test
public void test_224() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.35) < 1e-10);
}
@Test
public void test_225() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.51) < 1e-10);
}
@Test
public void test_226() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 55.4905) < 1e-10);
}
@Test
public void test_227() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.9805) < 1e-10);
}
@Test
public void test_228() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.9805) < 1e-10);
}
@Test
public void test_229() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 25.9405) < 1e-10);
}
@Test
public void test_230() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 55.4905) < 1e-10);
}
@Test
public void test_231() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.9805) < 1e-10);
}
@Test
public void test_232() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.1705) < 1e-10);
}
@Test
public void test_233() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 41.3305) < 1e-10);
}
@Test
public void test_234() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 82.6805) < 1e-10);
}
@Test
public void test_235() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 21.3705) < 1e-10);
}
@Test
public void test_236() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.1705) < 1e-10);
}
@Test
public void test_237() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 41.3305) < 1e-10);
}
@Test
public void test_238() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 27.3036) < 1e-10);
}
@Test
public void test_239() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 76.6236) < 1e-10);
}
@Test
public void test_240() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 47.2636) < 1e-10);
}
@Test
public void test_241() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 29.1036) < 1e-10);
}
@Test
public void test_242() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.3136) < 1e-10);
}
@Test
public void test_243() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 76.6236) < 1e-10);
}
@Test
public void test_244() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 59.3305) < 1e-10);
}
@Test
public void test_245() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.1805) < 1e-10);
}
@Test
public void test_246() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.3705) < 1e-10);
}
@Test
public void test_247() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 75.6905) < 1e-10);
}
@Test
public void test_248() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 34.3405) < 1e-10);
}
@Test
public void test_249() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 41.1705) < 1e-10);
}
@Test
public void test_250() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 78.814) < 1e-10);
}
@Test
public void test_251() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.714) < 1e-10);
}
@Test
public void test_252() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.514) < 1e-10);
}
@Test
public void test_253() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 37.464) < 1e-10);
}
@Test
public void test_254() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.714) < 1e-10);
}
@Test
public void test_255() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.674) < 1e-10);
}
@Test
public void test_256() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 56.8405) < 1e-10);
}
@Test
public void test_257() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.3305) < 1e-10);
}
@Test
public void test_258() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.5305) < 1e-10);
}
@Test
public void test_259() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 25.2905) < 1e-10);
}
@Test
public void test_260() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.3305) < 1e-10);
}
@Test
public void test_261() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 25.2905) < 1e-10);
}
@Test
public void test_262() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 55.4905) < 1e-10);
}
@Test
public void test_263() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.9805) < 1e-10);
}
@Test
public void test_264() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.1805) < 1e-10);
}
@Test
public void test_265() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.9405) < 1e-10);
}
@Test
public void test_266() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.9405) < 1e-10);
}
@Test
public void test_267() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.9405) < 1e-10);
}
@Test
public void test_268() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 78.68) < 1e-10);
}
@Test
public void test_269() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.38) < 1e-10);
}
@Test
public void test_270() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.18) < 1e-10);
}
@Test
public void test_271() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 35.86) < 1e-10);
}
@Test
public void test_272() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 65.41) < 1e-10);
}
@Test
public void test_273() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 18.91) < 1e-10);
}
@Test
public void test_274() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 18.91) < 1e-10);
}
@Test
public void test_275() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 35.86) < 1e-10);
}
@Test
public void test_276() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 65.41) < 1e-10);
}
@Test
public void test_277() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 31.29) < 1e-10);
}
@Test
public void test_278() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.09) < 1e-10);
}
@Test
public void test_279() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 51.25) < 1e-10);
}
@Test
public void test_280() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 92.6) < 1e-10);
}
@Test
public void test_281() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 31.29) < 1e-10);
}
@Test
public void test_282() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.09) < 1e-10);
}
@Test
public void test_283() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 99.35) < 1e-10);
}
@Test
public void test_284() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 46.01) < 1e-10);
}
@Test
public void test_285() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 27.85) < 1e-10);
}
@Test
public void test_286() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 26.05) < 1e-10);
}
@Test
public void test_287() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 87.36) < 1e-10);
}
@Test
public void test_288() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 58) < 1e-10);
}
@Test
public void test_289() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 51.09) < 1e-10);
}
@Test
public void test_290() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24.3) < 1e-10);
}
@Test
public void test_291() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 110.6) < 1e-10);
}
@Test
public void test_292() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 44.26) < 1e-10);
}
@Test
public void test_293() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 26.1) < 1e-10);
}
@Test
public void test_294() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 49.29) < 1e-10);
}
@Test
public void test_295() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 46.8) < 1e-10);
}
@Test
public void test_296() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 84.36) < 1e-10);
}
@Test
public void test_297() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 26.84) < 1e-10);
}
@Test
public void test_298() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 28.64) < 1e-10);
}
@Test
public void test_299() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.05) < 1e-10);
}
@Test
public void test_300() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 43.01) < 1e-10);
}
@Test
public void test_301() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 35.21) < 1e-10);
}
@Test
public void test_302() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 66.76) < 1e-10);
}
@Test
public void test_303() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 24.25) < 1e-10);
}
@Test
public void test_304() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 26.45) < 1e-10);
}
@Test
public void test_305() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 26.45) < 1e-10);
}
@Test
public void test_306() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 66.76) < 1e-10);
}
@Test
public void test_307() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.86) < 1e-10);
}
@Test
public void test_308() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 65.41) < 1e-10);
}
@Test
public void test_309() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 22.9) < 1e-10);
}
@Test
public void test_310() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 25.1) < 1e-10);
}
@Test
public void test_311() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 22.9) < 1e-10);
}
@Test
public void test_312() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 22.9) < 1e-10);
}
@Test
public void test_313() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 47.25) < 1e-10);
}
@Test
public void test_314() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 85.61) < 1e-10);
}
@Test
public void test_315() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 27.29) < 1e-10);
}
@Test
public void test_316() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.31) < 1e-10);
}
@Test
public void test_317() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 56.26) < 1e-10);
}
@Test
public void test_318() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 85.81) < 1e-10);
}
@Test
public void test_319() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.31) < 1e-10);
}
@Test
public void test_320() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.31) < 1e-10);
}
@Test
public void test_321() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 56.26) < 1e-10);
}
@Test
public void test_322() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 113) < 1e-10);
}
@Test
public void test_323() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 47.2) < 1e-10);
}
@Test
public void test_324() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 47) < 1e-10);
}
@Test
public void test_325() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 71.65) < 1e-10);
}
@Test
public void test_326() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 113) < 1e-10);
}
@Test
public void test_327() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 47.2) < 1e-10);
}
@Test
public void test_328() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 80.08) < 1e-10);
}
@Test
public void test_329() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 43.44) < 1e-10);
}
@Test
public void test_330() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 43.64) < 1e-10);
}
@Test
public void test_331() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 109.44) < 1e-10);
}
@Test
public void test_332() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 68.09) < 1e-10);
}
@Test
public void test_333() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 43.44) < 1e-10);
}
@Test
public void test_334() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 69.69) < 1e-10);
}
@Test
public void test_335() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 106.01) < 1e-10);
}
@Test
public void test_336() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 89.65) < 1e-10);
}
@Test
public void test_337() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 46.5) < 1e-10);
}
@Test
public void test_338() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 69.69) < 1e-10);
}
@Test
public void test_339() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 131) < 1e-10);
}
@Test
public void test_340() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 41.35) < 1e-10);
}
@Test
public void test_341() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 62.21) < 1e-10);
}
@Test
public void test_342() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 107.35) < 1e-10);
}
@Test
public void test_343() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 37.76) < 1e-10);
}
@Test
public void test_344() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 103.56) < 1e-10);
}
@Test
public void test_345() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 37.56) < 1e-10);
}
@Test
public void test_346() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.66) < 1e-10);
}
@Test
public void test_347() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 55.61) < 1e-10);
}
@Test
public void test_348() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 87.16) < 1e-10);
}
@Test
public void test_349() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.66) < 1e-10);
}
@Test
public void test_350() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.66) < 1e-10);
}
@Test
public void test_351() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.66) < 1e-10);
}
@Test
public void test_352() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.31) < 1e-10);
}
@Test
public void test_353() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.26) < 1e-10);
}
@Test
public void test_354() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 85.81) < 1e-10);
}
@Test
public void test_355() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.31) < 1e-10);
}
@Test
public void test_356() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.26) < 1e-10);
}
@Test
public void test_357() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.31) < 1e-10);
}
@Test
public void test_358() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 43) < 1e-10);
}
@Test
public void test_359() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 64.66) < 1e-10);
}
@Test
public void test_360() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 109) < 1e-10);
}
@Test
public void test_361() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 167.66) < 1e-10);
}
@Test
public void test_362() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 167.66) < 1e-10);
}
@Test
public void test_363() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 184.61) < 1e-10);
}
@Test
public void test_364() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 214.16) < 1e-10);
}
@Test
public void test_365() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 167.66) < 1e-10);
}
@Test
public void test_366() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 167.66) < 1e-10);
}
@Test
public void test_367() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 200) < 1e-10);
}
@Test
public void test_368() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 241.35) < 1e-10);
}
@Test
public void test_369() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 175.55) < 1e-10);
}
@Test
public void test_370() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 175.35) < 1e-10);
}
@Test
public void test_371() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 200) < 1e-10);
}
@Test
public void test_372() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 241.35) < 1e-10);
}
@Test
public void test_373() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 194.35) < 1e-10);
}
@Test
public void test_374() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 182.56) < 1e-10);
}
@Test
public void test_375() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 260.35) < 1e-10);
}
@Test
public void test_376() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 207.01) < 1e-10);
}
@Test
public void test_377() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 182.36) < 1e-10);
}
@Test
public void test_378() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 194.55) < 1e-10);
}
@Test
public void test_379() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 259.35) < 1e-10);
}
@Test
public void test_380() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 193.01) < 1e-10);
}
@Test
public void test_381() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 174.85) < 1e-10);
}
@Test
public void test_382() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 173.05) < 1e-10);
}
@Test
public void test_383() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 234.36) < 1e-10);
}
@Test
public void test_384() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 218) < 1e-10);
}
@Test
public void test_385() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 162.35) < 1e-10);
}
@Test
public void test_386() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 158.36) < 1e-10);
}
@Test
public void test_387() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 186.8) < 1e-10);
}
@Test
public void test_388() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 224.36) < 1e-10);
}
@Test
public void test_389() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 158.36) < 1e-10);
}
@Test
public void test_390() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 162.15) < 1e-10);
}
@Test
public void test_391() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 169.01) < 1e-10);
}
@Test
public void test_392() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 169.01) < 1e-10);
}
@Test
public void test_393() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 183.96) < 1e-10);
}
@Test
public void test_394() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 215.51) < 1e-10);
}
@Test
public void test_395() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 169.01) < 1e-10);
}
@Test
public void test_396() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 183.96) < 1e-10);
}
@Test
public void test_397() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 167.66) < 1e-10);
}
@Test
public void test_398() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 167.66) < 1e-10);
}
@Test
public void test_399() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 182.61) < 1e-10);
}
@Test
public void test_400() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 214.16) < 1e-10);
}
@Test
public void test_401() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 182.61) < 1e-10);
}
@Test
public void test_402() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 214.16) < 1e-10);
}
@Test
public void test_403() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 171.55) < 1e-10);
}
@Test
public void test_404() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 168.36) < 1e-10);
}
@Test
public void test_405() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 193.01) < 1e-10);
}
@Test
public void test_406() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 469.16) < 1e-10);
}
@Test
public void test_407() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 422.66) < 1e-10);
}
@Test
public void test_408() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 422.66) < 1e-10);
}
@Test
public void test_409() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 439.61) < 1e-10);
}
@Test
public void test_410() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 469.16) < 1e-10);
}
@Test
public void test_411() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 422.66) < 1e-10);
}
@Test
public void test_412() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 430.35) < 1e-10);
}
@Test
public void test_413() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 455) < 1e-10);
}
@Test
public void test_414() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 496.35) < 1e-10);
}
@Test
public void test_415() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 430.55) < 1e-10);
}
@Test
public void test_416() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 430.35) < 1e-10);
}
@Test
public void test_417() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 455) < 1e-10);
}
@Test
public void test_418() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 470.55) < 1e-10);
}
@Test
public void test_419() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 524.36) < 1e-10);
}
@Test
public void test_420() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 483.01) < 1e-10);
}
@Test
public void test_421() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 470.35) < 1e-10);
}
@Test
public void test_422() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 470.55) < 1e-10);
}
@Test
public void test_423() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 536.35) < 1e-10);
}
@Test
public void test_424() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 473) < 1e-10);
}
@Test
public void test_425() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 429.85) < 1e-10);
}
@Test
public void test_426() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 428.05) < 1e-10);
}
@Test
public void test_427() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 514.35) < 1e-10);
}
@Test
public void test_428() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 473) < 1e-10);
}
@Test
public void test_429() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 454.84) < 1e-10);
}
@Test
public void test_430() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 468.15) < 1e-10);
}
@Test
public void test_431() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 398.56) < 1e-10);
}
@Test
public void test_432() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 402.15) < 1e-10);
}
@Test
public void test_433() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 426.8) < 1e-10);
}
@Test
public void test_434() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 402.35) < 1e-10);
}
@Test
public void test_435() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 468.15) < 1e-10);
}
@Test
public void test_436() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 470.51) < 1e-10);
}
@Test
public void test_437() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 424.01) < 1e-10);
}
@Test
public void test_438() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 424.01) < 1e-10);
}
@Test
public void test_439() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 438.96) < 1e-10);
}
@Test
public void test_440() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 438.96) < 1e-10);
}
@Test
public void test_441() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 424.01) < 1e-10);
}
@Test
public void test_442() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 469.16) < 1e-10);
}
@Test
public void test_443() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 422.66) < 1e-10);
}
@Test
public void test_444() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 422.66) < 1e-10);
}
@Test
public void test_445() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 437.61) < 1e-10);
}
@Test
public void test_446() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 422.66) < 1e-10);
}
@Test
public void test_447() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 422.66) < 1e-10);
}
@Test
public void test_448() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 492.35) < 1e-10);
}
@Test
public void test_449() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 423.56) < 1e-10);
}
@Test
public void test_450() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 423.36) < 1e-10);
}
@Test
public void test_451() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 694.61) < 1e-10);
}
@Test
public void test_452() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 724.16) < 1e-10);
}
@Test
public void test_453() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 677.66) < 1e-10);
}
@Test
public void test_454() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 677.66) < 1e-10);
}
@Test
public void test_455() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 694.61) < 1e-10);
}
@Test
public void test_456() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 724.16) < 1e-10);
}
@Test
public void test_457() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 685.55) < 1e-10);
}
@Test
public void test_458() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 685.35) < 1e-10);
}
@Test
public void test_459() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 710) < 1e-10);
}
@Test
public void test_460() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 751.35) < 1e-10);
}
@Test
public void test_461() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 685.55) < 1e-10);
}
@Test
public void test_462() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 685.35) < 1e-10);
}
@Test
public void test_463() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 812.35) < 1e-10);
}
@Test
public void test_464() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 759.01) < 1e-10);
}
@Test
public void test_465() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 746.35) < 1e-10);
}
@Test
public void test_466() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 734.56) < 1e-10);
}
@Test
public void test_467() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 800.36) < 1e-10);
}
@Test
public void test_468() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 759.01) < 1e-10);
}
@Test
public void test_469() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 709.84) < 1e-10);
}
@Test
public void test_470() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 683.05) < 1e-10);
}
@Test
public void test_471() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 769.35) < 1e-10);
}
@Test
public void test_472() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 728) < 1e-10);
}
@Test
public void test_473() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 684.85) < 1e-10);
}
@Test
public void test_474() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 708.04) < 1e-10);
}
@Test
public void test_475() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 666.8) < 1e-10);
}
@Test
public void test_476() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 704.36) < 1e-10);
}
@Test
public void test_477() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 642.35) < 1e-10);
}
@Test
public void test_478() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 638.36) < 1e-10);
}
@Test
public void test_479() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 642.15) < 1e-10);
}
@Test
public void test_480() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 704.36) < 1e-10);
}
@Test
public void test_481() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 693.96) < 1e-10);
}
@Test
public void test_482() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 725.51) < 1e-10);
}
@Test
public void test_483() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 679.01) < 1e-10);
}
@Test
public void test_484() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 679.01) < 1e-10);
}
@Test
public void test_485() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 725.51) < 1e-10);
}
@Test
public void test_486() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 679.01) < 1e-10);
}
@Test
public void test_487() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 692.61) < 1e-10);
}
@Test
public void test_488() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 724.16) < 1e-10);
}
@Test
public void test_489() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 677.66) < 1e-10);
}
@Test
public void test_490() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 677.66) < 1e-10);
}
@Test
public void test_491() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 724.16) < 1e-10);
}
@Test
public void test_492() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 692.61) < 1e-10);
}
@Test
public void test_493() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 706) < 1e-10);
}
@Test
public void test_494() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 744.36) < 1e-10);
}
@Test
public void test_495() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.56) < 1e-10);
}
@Test
public void test_496() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.51) < 1e-10);
}
@Test
public void test_497() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 695.46) < 1e-10);
}
@Test
public void test_498() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 725.01) < 1e-10);
}
@Test
public void test_499() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.51) < 1e-10);
}
@Test
public void test_500() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.51) < 1e-10);
}
@Test
public void test_501() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 695.46) < 1e-10);
}
@Test
public void test_502() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 752.2) < 1e-10);
}
@Test
public void test_503() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 686.4) < 1e-10);
}
@Test
public void test_504() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 686.2) < 1e-10);
}
@Test
public void test_505() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 710.85) < 1e-10);
}
@Test
public void test_506() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 752.2) < 1e-10);
}
@Test
public void test_507() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 686.4) < 1e-10);
}
@Test
public void test_508() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 771.92) < 1e-10);
}
@Test
public void test_509() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 735.28) < 1e-10);
}
@Test
public void test_510() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 747.47) < 1e-10);
}
@Test
public void test_511() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 813.27) < 1e-10);
}
@Test
public void test_512() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 771.92) < 1e-10);
}
@Test
public void test_513() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 747.27) < 1e-10);
}
@Test
public void test_514() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 708.89) < 1e-10);
}
@Test
public void test_515() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 745.21) < 1e-10);
}
@Test
public void test_516() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 728.85) < 1e-10);
}
@Test
public void test_517() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 685.7) < 1e-10);
}
@Test
public void test_518() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 683.9) < 1e-10);
}
@Test
public void test_519() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 745.21) < 1e-10);
}
@Test
public void test_520() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 642.95) < 1e-10);
}
@Test
public void test_521() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 663.81) < 1e-10);
}
@Test
public void test_522() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 708.95) < 1e-10);
}
@Test
public void test_523() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 643.15) < 1e-10);
}
@Test
public void test_524() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 643.15) < 1e-10);
}
@Test
public void test_525() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 639.16) < 1e-10);
}
@Test
public void test_526() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 679.86) < 1e-10);
}
@Test
public void test_527() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 694.81) < 1e-10);
}
@Test
public void test_528() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 726.36) < 1e-10);
}
@Test
public void test_529() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 679.86) < 1e-10);
}
@Test
public void test_530() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 679.86) < 1e-10);
}
@Test
public void test_531() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 694.81) < 1e-10);
}
@Test
public void test_532() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.51) < 1e-10);
}
@Test
public void test_533() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 693.46) < 1e-10);
}
@Test
public void test_534() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 725.01) < 1e-10);
}
@Test
public void test_535() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.51) < 1e-10);
}
@Test
public void test_536() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.51) < 1e-10);
}
@Test
public void test_537() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.51) < 1e-10);
}
@Test
public void test_538() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 682.2) < 1e-10);
}
@Test
public void test_539() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 703.86) < 1e-10);
}
@Test
public void test_540() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 748.2) < 1e-10);
}
@Test
public void test_541() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 11.05) < 1e-10);
}
@Test
public void test_542() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.21) < 1e-10);
}
@Test
public void test_543() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 679.41) < 1e-10);
}
@Test
public void test_544() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.34) < 1e-10);
}
@Test
public void test_545() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 29.09) < 1e-10);
}
@Test
public void test_546() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.36) < 1e-10);
}
@Test
public void test_547() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23) < 1e-10);
}
@Test
public void test_548() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 34.34) < 1e-10);
}
@Test
public void test_549() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 448.01) < 1e-10);
}
@Test
public void test_550() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 72.02) < 1e-10);
}
@Test
public void test_551() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.50, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 77.85) < 1e-10);
}
@Test
public void test_552() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 237.35) < 1e-10);
}
@Test
public void test_553() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.675) < 1e-10);
}
@Test
public void test_554() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 34.3405) < 1e-10);
}
@Test
public void test_555() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 85.61) < 1e-10);
}
@Test
public void test_556() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.21) < 1e-10);
}
@Test
public void test_557() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 193.01) < 1e-10);
}
@Test
public void test_558() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 423.56) < 1e-10);
}
@Test
public void test_559() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.36) < 1e-10);
}
@Test
public void test_560() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 703.86) < 1e-10);
}
