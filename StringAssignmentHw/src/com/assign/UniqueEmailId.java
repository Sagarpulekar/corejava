package com.assign;

import java.util.Scanner;

public class UniqueEmailId {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = scanner.nextLine();
		System.out.println("Enter the second string:");
		String str2 = scanner.nextLine();
		String[] words1 = str1.split("\\s+");
		String[] words2 = str2.split("\\s+");
		System.out.println("Unique words:");
		for (String word : words1) {
			if (!str2.contains(word)) {
				System.out.println(word);
			}
		}
		for (String word : words2) {
			if (!str1.contains(word)) {
				System.out.println(word);
			}
		}
	}
}
//mamta@gmail.com pratik@gmail.com vivek@gmail.com suyog@gmail.com
//vivek@gmail.com suyog@gmail.com bhushan@gmail.com priya@gmail.com