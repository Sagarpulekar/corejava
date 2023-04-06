package com.assign;

import java.util.Scanner;

public class CountFrequencyOfString {
	public static void countfrequency(String s) {
		s = s.toLowerCase();
		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			count = 1;
			if ((ch[i] == ' ') || (ch[i] == '\0'))
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';

				}

			}
			System.out.println(ch[i] + ":" + count);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String Want to Calculate the Frequency:-");
		String s1 = sc.nextLine();
		countfrequency(s1);
	}

}
