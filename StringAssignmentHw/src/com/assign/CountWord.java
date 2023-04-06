package com.assign;

import java.util.Scanner;

public class CountWord {
	public static int countWords(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				count++;

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Count Words:-");
		String s1 = sc.nextLine();
		int cnt = countWords(s1);
		System.out.println(s1);
		System.out.println("Total Number Of Character In String:-" + cnt);

	}

}
