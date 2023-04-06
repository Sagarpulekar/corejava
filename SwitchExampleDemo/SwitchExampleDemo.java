package com.SwitchExampleDemo;

import java.util.Scanner;

public class SwitchExampleDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("Enter month number(1-12): ");
		month = sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
		default:
			System.out.println("Invalid input! Please enter month number between 1-12");
		}
	}
}