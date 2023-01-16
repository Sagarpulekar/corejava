package com.SwitchExampleDemo;

import java.util.Scanner;

public class SwitchExampleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a character :");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " is consonant");
		}
	}
}