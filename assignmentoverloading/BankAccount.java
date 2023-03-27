package com.assignmentoverloading;

public class BankAccount {

	int rate;

	public void def(int rate) {
		this.rate = 2;
		if (rate == 2) {
			System.out.println("The enter rate of interest is " + rate + "and for default account");
		}
	}

	public void saving(int rate) {

		this.rate = 3;
		if (rate == 3) {

			System.out.println("The enter rate of interest is " + rate + "and for saving account");
		}
	}

	public void current(int rate) {

		this.rate = 5;
		if (rate == 5) {

			System.out.println("The enter rate of interest is " + rate + "and for current account");
		}
	}

	public void display() {
		System.out.println("The enter rate of interest is " + rate + "and for default account");
		System.out.println("The enter rate of interest is " + rate + "and for saving account");
		System.out.println("The enter rate of interest is " + rate + "and for current account");
	}

}
