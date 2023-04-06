package com.SwitchExampleDemo;

import java.util.Scanner;

public class EnterNumber1to5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER BETWEEN 1 TO 5");
		int num1 = sc.nextInt();
		switch (num1) {
		case 1:
			System.out.println("1 inform of word ONE");
			break;
		case 2:
			System.out.println("2 inform of word TWO");
			break;
		case 3:
			System.out.println("3 inform of word THREE");
			break;
		case 4:
			System.out.println("4 inform of word FOUR");
			break;
		case 5:
			System.out.println("5 inform of word FIVE");
			break;
		default:
			System.out.println("invalid input number");
			sc.close();
		}

	}

}
