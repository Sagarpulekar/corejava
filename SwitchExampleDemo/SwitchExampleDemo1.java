package com.SwitchExampleDemo;

import java.util.Scanner;

public class SwitchExampleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, p;
		System.out.println("Enter number 1");
		num1 = sc.nextInt();
		System.out.println("Enter number 2");
		num2 = sc.nextInt();
		System.out.println("MENU");
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION");
		System.out.println("3. MULTIPLICATION");
		System.out.println("4. DIVISION");
		System.out.println("5. MODULUS");
		int a, b, c, d, e, f;
		a = num1 + num2;
		b = num1 - num2;
		c = num1 * num2;
		d = num1 / num2;
		e = num1 % num2;
		System.out.println("ENTER NUMBER FROM ABOVE MENU TO PERFORM TASK");
		p = sc.nextInt();
		switch (p) {
		case 1:
			System.out.println("ADDITION IS " + a);
			break;
		case 2:
			System.out.println("SUBTRACTION IS " + b);
			break;
		case 3:
			System.out.println("MULTIPLICATION IS" + c);
			break;
		case 4:
			System.out.println("DIVISION IS :" + d);
			break;
		case 5:
			System.out.println("MODULUS IS :" + e);
		default:
			System.out.println("ENTER NUMBER IS WRONG");

		}

	}

}
