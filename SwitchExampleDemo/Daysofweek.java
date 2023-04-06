package com.SwitchExampleDemo;

import java.util.Scanner;

public class Daysofweek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER FROM 1 TO 7 OF WEEK:");
		int d = sc.nextInt();
		switch (d) {
		case 1:
			System.out.println("1. MONDAY");
			break;
		case 2:
			System.out.println("2. TUESDAY");
			break;
		case 3:
			System.out.println("3. WEDNESDAY");
			break;
		case 4:
			System.out.println("4. THUSDAY");
			break;
		case 5:
			System.out.println("5. FRIDAY");
			break;
		case 6:
			System.out.println("6. SATURDAY");
			break;
		case 7:
			System.out.println("7. SUNDAY");
			break;
		default:
			System.out.println("error, day does not exist");
		}

	}

}
