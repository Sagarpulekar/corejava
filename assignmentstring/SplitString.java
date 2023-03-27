package com.assignmentstring;

import java.util.Scanner;

public class SplitString {
	public static void splitString(String s) {
		int noofWords = 0; // for counting words
		String word[] = s.split("");
		for (String w : word) {
			System.out.println(w);
			noofWords++;
		}
		System.out.println("Number of words:" + noofWords);
	}

	public static void splitWithoutMethodString(String st) {
		String word = " ";

		String[] splitst = new String[20];
		int temp = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) != ' ') {
				word = word + st.charAt(i);
			} else {
				// to store the word
				splitst[temp] = word;
				temp++;
				word = "";
			}
		}

		for (int i = 0; i < temp; i++) {
			System.out.println(splitst[i]);
			st = st + ' ';
		}

		System.out.println("Number of words:" + temp);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a line");
		String str = sc.nextLine();
		splitString(str);
	}

}
