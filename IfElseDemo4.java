package com.IfElse;

import java.util.Scanner;

public class IfElseDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("ENTER A VALUE :");
		num1 = sc.nextInt();
		if (num1 > 0) {
			System.out.println(num1 + "is a positive number  :");
		} else if (num1 < 0) {
			System.out.println(num1 + "is a negative number  :");
		} else {
			System.out.println(num1 + "is zero  :");
		}
	}

}
