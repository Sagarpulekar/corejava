package com.assign;

import java.util.Arrays;

public class SortArraywordlength {
	public static void sortArray(String[] s) {
		String temp;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].length() == s[j].length()) {
					if ((s[i].compareTo(s[j])) > 1) {
						temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				} else {
					if (s[i].length() > s[j].length()) {
						temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				}
			}
		}

		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		String[] s1 = { "C", "JAVA", "CSHARP", "GO", "PYTHON", "ANGULAR", "ASP.NET" };
		sortArray(s1);

	}

}
