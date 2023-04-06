package com.linkedlistdemo;

import java.util.Comparator;
import java.util.LinkedList;

public class OrderTest {
	public static void main(String[] args) {
		LinkedList<Order> orders = new LinkedList<>();
		orders.add(new Order(1, "Cashew", 10.0));
		orders.add(new Order(2, "Peanuts", 5.0));
		orders.add(new Order(3, "Sugar", 20.0));
		orders.add(new Order(4, "Biscuit", 15.0));

		Comparator<Order> Comparator = new Comparator<Order>() {

			public int compare(Order o1, Order o2) {
				return Double.compare(o1.getOrderPrice(), o2.getOrderPrice());
			}
		};
		orders.sort(Comparator);

		for (Order order : orders) {
			System.out.println(order);
		}
	}
}
