package com.constructordemo;

public class Account {
	private long accNo;
	private String customerName;

	public Account() {
		System.out.println("default constructor");
		this.accNo = 1234;
		this.customerName = "unknown";
	}

	public Account(long accNo, String customeName) {
		System.out.println("parameterized constructor 1");
		this.accNo = 54512451;
		this.customerName = "mmmmmmm";
	}

	public Account(String customeName) {
		System.out.println("parameterized constructor 2");
		this.customerName = "dgdasdytsdas";
	}

	public Account(long accNo) {
		System.out.println("parameterized constructor 3");
		this.accNo = 12121212;
	}

	void display() {
		System.out.println(accNo + " " + customerName);
	}

}
