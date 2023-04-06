package com.assign;

import java.util.Scanner;

public class CapitalFirstLetterFromString {
	public static String capitalizeWord(String str) {
		String words[] = str.split(" ");
		String capitalizeWord = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}
		return capitalizeWord.trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:-");
		String s1 = sc.nextLine();
		System.out.println(capitalizeWord(s1));
	}

}
