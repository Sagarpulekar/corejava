package com.IfElse;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number1 :");
		int num1 = s.nextInt();
		System.out.print("Enter Number2 :");
		int num2 = s.nextInt();
		System.out.print("Enter Number3 :");
		int num3 = s.nextInt();
		if ((num1 > num2) && (num1 > num3)) {
			System.out.print("Value " + num1 + " is greater than " + num2 + "and" + num3);
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.print("Value " + num2 + " is greater than " + num1 + "and" + num3);
		} else if ((num3 > num2) && (num3 > num1)) {
			System.out.print("Value " + num3 + " is greater than " + num2 + "and" + num1);
		} else {
			System.out.println("ALL ENTERED NUMBER ARE SAME");
		}

	}

}
