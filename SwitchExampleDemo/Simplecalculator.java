package com.SwitchExampleDemo;

import java.util.Scanner;

public class Simplecalculator {

	public static void main(String[] args) {
		int a;
		Double num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
		a = input.next().charAt(0);
		System.out.println("Enter first number");
		num1 = input.nextDouble();
		System.out.println("Enter second number");
		num2 = input.nextDouble();
		switch (a) {
		case '+':
			Double result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		default:
			System.out.println("Invalid number");
		}

	}
}
