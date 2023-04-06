package com.arraylistdemo;

import java.util.ArrayList;

public class ReplaceSecondElementExample {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		System.out.println("ArrayList before replacement: " + numbers);

		int index = 1; // Index of the second element
		int newElement = 25; // New element to replace the existing element
		numbers.set(index, newElement);

		System.out.println("ArrayList after replacement: " + numbers);
	}
}
