package com.assign;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	/*
	 * public static void main(String[] args) { { String str =
	 * "	 java	 is programming       language";
	 * 
	 * str = str.replaceAll("\\s", "");
	 * 
	 * System.out.println(str); }
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		s = s.trim().replaceAll("\\s+", " ");

		// Print out cleaned string
		System.out.println("After Removing Spaces from string: " + s);
	}
}
