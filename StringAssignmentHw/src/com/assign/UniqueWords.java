package com.assign;

import java.util.Scanner;

public class UniqueWords {
	public static void uniqueword(String s) {
		s = s.toLowerCase();
		String word[] = s.split("");
		int count;
		int ucount = 0;
		for (int i = 0; i < word.length; i++) {
			if (word[i].equals("\0"))
				continue;
			count = 1;

			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					count++;
					word[j] = "\0";
				}
			}
			if (count == 1) {
				System.out.println("unique word are " + word[i] + ": " + ucount);
				ucount++;

			}
		}

		System.out.println("Number of Unique word are:" + ucount);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check unique word: ");
		String s1 = "";
		s1 = sc.nextLine();

		uniqueword(s1);
	}
}
