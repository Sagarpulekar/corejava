package com.SwitchExampleDemo;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 11, i, flag = 0;
		System.out.println("Enter number to check prime number or not");
		/*
		 * Scanner sc = new Scanner(System.in); int num1 =sc.nextInt();
		 */
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) // check for non prime number
			{
				flag = 1;
				break;
			}
			if (flag == 0) {
				System.out.println(num + " is a prime number.");
			} else {
				System.out.println(num + " is not a prime number.");
			}
		}
	}
}
