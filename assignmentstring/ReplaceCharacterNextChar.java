package com.assignmentstring;

import java.util.Scanner;

public class ReplaceCharacterNextChar {
	public static void replacecharacter(String s) {
		char[] ch = s.toCharArray();
		int val = 0;
		String s1 = "";
		for (int i = 0; i < ch.length; i++) {
			val = ch[i] + 1;
			char c = (char) val;
			// System.out.println(c);
			s1 = s1 + c;
			// System.out.println(s1);
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		replacecharacter(s);

	}
}