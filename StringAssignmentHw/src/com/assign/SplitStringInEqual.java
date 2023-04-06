package com.assign;

public class SplitStringInEqual {

	static void splitString(String str1, int n) {
		int len = str1.length();
		int len1;
		if (len % n != 0) {
			System.out.println("The size of the given string is not divisible by " + n);
			return;
		} else {
			System.out.println("The given string is: " + str1);
			System.out.println("The string divided into " + n + " parts and they are: ");
			len1 = len / n;
			for (int i = 0; i < len; i++) {
				if (i % len1 == 0)
					System.out.println();
				System.out.print(str1.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		String str1 = "javaislanguagess";
		int splitnumber = 4;
		splitString(str1, splitnumber);
	}
}
