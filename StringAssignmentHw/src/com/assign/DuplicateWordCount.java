package com.assign;

import java.util.Scanner;

public class DuplicateWordCount {
	public static void countDuplicate(String s) {
		s = s.toLowerCase();
		String words[] = s.split(" ");
		int temp;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(" ") || words[i].equals("visited"))
				continue;
			temp = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					temp++;
					words[j] = "visited";
				}
			}

			if (temp > 1)
				System.out.println("Number Of Words Duplicate As Below:-" + words[i] + ":" + temp);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter String you want to count duplicate of words in string:- ");
		String s1 = sc.nextLine();
		// String s1 = "Java is a program. We code logics in Java. Code is important.";
		countDuplicate(s1);

	}
}
