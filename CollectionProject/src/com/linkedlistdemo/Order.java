package com.linkedlistdemo;

public class Order {

	private int orderId;
	private String customerName;
	private double orderPrice;

	public Order(int orderId, String customerName, double orderPrice) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderPrice = orderPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public String toString() {
		return "OrderId=" + orderId + " customerName=" + customerName + "orderPrice=" + orderPrice;
	}

}
