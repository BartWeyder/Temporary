@Test
public void test_1() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 0.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 6.065) < 1e-10);
}
@Test
public void test_2() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 0.5, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 30.49) < 1e-10);
}
@Test
public void test_3() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 0.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 64.85) < 1e-10);
}
@Test
public void test_4() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 0.5, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 28.53) < 1e-10);
}
@Test
public void test_5() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 0.5, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 8.13) < 1e-10);
}
@Test
public void test_6() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 0.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.375) < 1e-10);
}
@Test
public void test_7() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 0.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 45.575) < 1e-10);
}
@Test
public void test_8() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 5.53) < 1e-10);
}
@Test
public void test_9() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.46) < 1e-10);
}
@Test
public void test_10() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 71.35) < 1e-10);
}
@Test
public void test_11() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 1, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.04) < 1e-10);
}
@Test
public void test_12() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 4.85) < 1e-10);
}
@Test
public void test_13() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 22.01) < 1e-10);
}
@Test
public void test_14() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.85) < 1e-10);
}
@Test
public void test_15() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 2.5) < 1e-10);
}
@Test
public void test_16() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 1, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 3.85) < 1e-10);
}
@Test
public void test_17() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 7.3195) < 1e-10);
}
@Test
public void test_18() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 17.51) < 1e-10);
}
@Test
public void test_19() {
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
public void test_20() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 95.02) < 1e-10);
}
@Test
public void test_21() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 6.67, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 72.82) < 1e-10);
}
@Test
public void test_22() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 51.1795) < 1e-10);
}
@Test
public void test_23() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 18.2795) < 1e-10);
}
@Test
public void test_24() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 6.67, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 69.03) < 1e-10);
}
@Test
public void test_25() {
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
public void test_26() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 20.34) < 1e-10);
}
@Test
public void test_27() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 44) < 1e-10);
}
@Test
public void test_28() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 11.55) < 1e-10);
}
@Test
public void test_29() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.84) < 1e-10);
}
@Test
public void test_30() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 13.7) < 1e-10);
}
@Test
public void test_31() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 10, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 12.35) < 1e-10);
}
@Test
public void test_32() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 10, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 34) < 1e-10);
}
@Test
public void test_33() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 12.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.785) < 1e-10);
}
@Test
public void test_34() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 12.5, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 20.665) < 1e-10);
}
@Test
public void test_35() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 12.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 16.35) < 1e-10);
}
@Test
public void test_36() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 12.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.635) < 1e-10);
}
@Test
public void test_37() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 12.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 14.85) < 1e-10);
}
@Test
public void test_38() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 12.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 15.825) < 1e-10);
}
@Test
public void test_39() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 54.785) < 1e-10);
}
@Test
public void test_40() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 12.5, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 74.86) < 1e-10);
}
@Test
public void test_41() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 55.4905) < 1e-10);
}
@Test
public void test_42() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 21.3705) < 1e-10);
}
@Test
public void test_43() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 17.1136) < 1e-10);
}
@Test
public void test_44() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 59.3305) < 1e-10);
}
@Test
public void test_45() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 75.024) < 1e-10);
}
@Test
public void test_46() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 25.2905) < 1e-10);
}
@Test
public void test_47() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13.33, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 23.9405) < 1e-10);
}
@Test
public void test_48() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 13.33, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 19.17) < 1e-10);
}
@Test
public void test_49() {
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
public void test_50() {
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
public void test_51() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 39.84) < 1e-10);
}
@Test
public void test_52() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 44.26) < 1e-10);
}
@Test
public void test_53() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 25, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 88.15) < 1e-10);
}
@Test
public void test_54() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 66.76) < 1e-10);
}
@Test
public void test_55() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 33.86) < 1e-10);
}
@Test
public void test_56() {
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
public void test_57() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 85.81) < 1e-10);
}
@Test
public void test_58() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 47.2) < 1e-10);
}
@Test
public void test_59() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 43.44) < 1e-10);
}
@Test
public void test_60() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 89.65) < 1e-10);
}
@Test
public void test_61() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 49, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 66) < 1e-10);
}
@Test
public void test_62() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 55.61) < 1e-10);
}
@Test
public void test_63() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 85.81) < 1e-10);
}
@Test
public void test_64() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 49, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 40.01) < 1e-10);
}
@Test
public void test_65() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 214.16) < 1e-10);
}
@Test
public void test_66() {
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
public void test_67() {
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
public void test_68() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 193.01) < 1e-10);
}
@Test
public void test_69() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 200, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 162.35) < 1e-10);
}
@Test
public void test_70() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 183.96) < 1e-10);
}
@Test
public void test_71() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 200, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 182.61) < 1e-10);
}
@Test
public void test_72() {
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
public void test_73() {
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
public void test_74() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 430.55) < 1e-10);
}
@Test
public void test_75() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 458.36) < 1e-10);
}
@Test
public void test_76() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 473) < 1e-10);
}
@Test
public void test_77() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 468.15) < 1e-10);
}
@Test
public void test_78() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 500, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 424.01) < 1e-10);
}
@Test
public void test_79() {
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
public void test_80() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 500, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 451) < 1e-10);
}
@Test
public void test_81() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 724.16) < 1e-10);
}
@Test
public void test_82() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 685.55) < 1e-10);
}
@Test
public void test_83() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 734.36) < 1e-10);
}
@Test
public void test_84() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 728) < 1e-10);
}
@Test
public void test_85() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 800, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 642.35) < 1e-10);
}
@Test
public void test_86() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 725.51) < 1e-10);
}
@Test
public void test_87() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 800, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 692.61) < 1e-10);
}
@Test
public void test_88() {
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
public void test_89() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 725.01) < 1e-10);
}
@Test
public void test_90() {
calendar.set(2018, 9, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 686.4) < 1e-10);
}
@Test
public void test_91() {
calendar.set(2018, 10, 1);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 735.28) < 1e-10);
}
@Test
public void test_92() {
calendar.set(2018, 1, 17);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 728.85) < 1e-10);
}
@Test
public void test_93() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 801, true));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 642.95) < 1e-10);
}
@Test
public void test_94() {
calendar.set(2018, 1, 15);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 694.81) < 1e-10);
}
@Test
public void test_95() {
calendar.set(2018, 3, 30);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 801, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 678.51) < 1e-10);
}
@Test
public void test_96() {
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
public void test_97() {
calendar.set(2018, 1, 16);
Order order = new Order();
order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 25, false));
order.setDate(calendar.getTime());
order.setShipment(ShipmentType.INTERNATIONAL);
double totalDeposit = new TotalDeposit(order).getTotalDeposit();
System.out.println(totalDeposit);
assertTrue(Math.abs(totalDeposit - 44.26) < 1e-10);
}
