package com.assign;

import java.util.Scanner;

public class ReplaceVowelByCharacter {

	public static String replaceall(String s) {
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 'A') || (s.charAt(i) == 'E') || (s.charAt(i) == 'I') || (s.charAt(i) == 'O')
					|| (s.charAt(i) == 'U') || (s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i')
					|| (s.charAt(i) == 'o') || (s.charAt(i) == 'u')) {
				s = s.replace(s.charAt(i), '$');
			}
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING WANT TO REPLACE:-");
		String s1 = sc.next();
		s1 = replaceall(s1);
		System.out.println(s1);

	}

}
