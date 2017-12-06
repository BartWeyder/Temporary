@Test
public void test_1() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.50, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.065) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 6.065) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 16.025) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 45.575) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.065) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 6.065) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 30.49) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 71.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 10.53) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 12.33) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 23.5) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 71.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 17.33) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.54) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 76.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 35.49) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 17.33) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 15.53) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 64.85) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 48.49) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 5.34) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.54) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 89.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 23.5) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 6.33) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 4.34) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 26.29) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 67.64) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 2.54) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 8.13) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 15.375) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 46.925) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 4.415) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 6.615) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 15.375) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 46.925) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.065) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 5.265) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 14.025) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 45.575) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.065) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 5.265) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 22.5) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 66.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 2.54) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 5.5) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 15.46) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 45.01) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 2.5) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 5.5) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 15.46) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 71.35) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 10.04) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 11.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 23.01) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 71.35) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.05) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 23.01) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 16.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.05) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 64.36) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 35) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 4.85) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 28.04) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 64.36) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 48) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 29.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.05) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 89.35) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.85) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 25.8) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 63.36) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 5.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 7.64) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 22.01) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 46.36) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.85) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 6.05) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 14.81) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 46.36) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 3.85) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 4.7) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 13.46) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 45.01) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 2.5) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 4.7) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 13.46) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 66.35) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 2.05) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 6.84) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 20.2795) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 49.8295) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 7.3195) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 10.3195) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 20.2795) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 49.8295) < 1e-2);
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
assertTrue(Math.abs(totalDeposit - 15.71) < 1e-2);
}
