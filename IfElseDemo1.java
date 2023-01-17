package com.IfElse;

import java.util.Scanner;

public class IfElseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number to Check whether it is Divisible by 5 and 11 : ");
		int number;
		number = sc.nextInt();

		if ((number % 5 == 0) && (number % 11 == 0)) {
			System.out.println("Given number " + number + " is Divisible by 5 and 11");
		} else {
			System.out.println(" Given number " + number + " is Not Divisible by 5 and 11");
		}
	}

}
