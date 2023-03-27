package com.assignmentstring;

import java.util.Scanner;

public class SplitStringinHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		int length = s.length();
		String firstHalf = s.substring(0, length / 2);
		String secondHalf = s.substring(length / 2);
		System.out.println("First half: " + firstHalf);
		System.out.println("Second half: " + secondHalf);
	}
}
