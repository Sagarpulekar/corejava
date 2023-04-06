package com.constructordemo;

public class ConstructorTest {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.display();
		System.out.println("------------");
		Account a2 = new Account(10145125, "ssss");
		a2.display();
		System.out.println("------------");
		Account a3 = new Account("mmmmmmm");
		a3.display();
		System.out.println("------------");
		Account a4 = new Account(5215424);
		a4.display();

	}

}
