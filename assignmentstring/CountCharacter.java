package com.assignmentstring;

import java.util.Scanner;

public class CountCharacter {
	public static int countChar(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Count Character:-");
		String s1 = sc.nextLine();
		int cnt = countChar(s1);

		System.out.println("Total Number Of Character In String:-" + cnt);

	}

}
