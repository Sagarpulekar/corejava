package com.assignmentstring;

import java.util.Scanner;

public class CountFrequencyOfWord {
	public static void countfrequency(String s) {
		s = s.toLowerCase();
		String word[] = s.split(" ");
		int count;

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
			System.out.println(word[i] + ":" + count);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String Want to Calculate the Frequency:-");
		String s1 = sc.nextLine();
		countfrequency(s1);
	}

}
