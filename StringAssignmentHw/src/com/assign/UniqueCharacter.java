package com.assign;

import java.util.Scanner;

public class UniqueCharacter {
	public static void uniqueCharacters(String s) {
		int count;
		int ucount = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if (ch[i] == '\0')
				continue;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			if (count == 1) {
				System.out.println("unique characters are " + ch[i] + ": " + ucount);
				ucount++;

			}
		}

		System.out.println("Number of Unique characters are:" + ucount);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check unique character: ");
		String word = "";
		word = sc.nextLine();

		uniqueCharacters(word);
	}
}
