package com.assign;

import java.util.Scanner;

public class CountWordandCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		int charCount = 0;
		int wordCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				charCount++;
			}
			if (ch == ' ' || i == str.length() - 1) {
				wordCount++;
			}
		}

		System.out.println("Number of characters: " + charCount);
		System.out.println("Number of words: " + wordCount);
	}
}
