package com.assignmentstring;

import java.util.Scanner;

public class DuplicateEmail {
	public static void duplicateWordCount(String str1, String str2) {
		String[] words1 = str1.split("\\s");
		String[] words2 = str2.split("\\s");
		System.out.println("Duplicate words:");
		int count = 0;
		for (int i = 0; i < words1.length; i++) {
			for (int j = 0; j < words2.length; j++) {
				if (words1[i].equals(words2[j])) {
					count++;
					if (count == 1) {
						System.out.println(words1[i]);
					}
				}
			}

		}
		if (count == 0)
			System.out.println("Total Number Of Character In String:-" + count);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = scanner.nextLine();
		System.out.println("Enter the second string:");
		String str2 = scanner.nextLine();
		duplicateWordCount(str1, str2);
	}
}
//mamta@gmail.com pratik@gmail.com vivek@gmail.com suyog@gmail.com
//vivek@gmail.com suyog@gmail.com bhushan@gmail.com priya@gmail.com
