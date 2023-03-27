package com.assignmentstring;

import java.util.Scanner;

public class UniqueWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();
		String[] words = input.split("\\s+");
		String[] uniqueWords = new String[words.length];
		int[] wordCounts = new int[words.length];
		int uniqueWordCount = 0;
		boolean isDuplicate;
		for (int i = 0; i < words.length; i++) {
			isDuplicate = false;
			for (int j = 0; j < uniqueWordCount; j++) {
				if (words[i].equals(uniqueWords[j])) {
					isDuplicate = true;
					wordCounts[j]++;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueWords[uniqueWordCount] = words[i];
				wordCounts[uniqueWordCount] = 1;
				uniqueWordCount++;
			}
		}

		System.out.println("Unique words:");
		for (int i = 0; i < uniqueWordCount; i++) {
			System.out.println(uniqueWords[i] + ": " + wordCounts[i]);
		}
	}
}
