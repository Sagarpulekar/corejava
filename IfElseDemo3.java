package com.IfElse;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else
			System.out.println(num + " is odd");
	}

}
