package com.IfElse;

import java.util.Scanner;

public class IfElseDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character : ");
		char ch = scanner.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is a alphabet.");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a digit.");
		} else {
			System.out.println(ch + " is a special character.");
		}

	}

}
