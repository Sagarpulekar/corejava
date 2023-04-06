package com.assign;

import java.util.Scanner;

public class CompareMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1 = sc.next();
		System.out.println("Enter 2nd String");
		String s2 = sc.next();
		if (s1.compareTo(s2) == 0) {
			System.out.println("String are Equal");
		} else if (s1.compareTo(s2) > 1) {
			System.out.println("String" + s1 + "is greater than" + s2);
		} else if (s1.compareTo(s2) < 1) {
			System.out.println("String" + s1 + "is less than" + s2);
		}
	}
}
