package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample17 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i <= 50; i++) {
			numbers.add(i);
		}

		Iterator<Integer> iterator = numbers.iterator();

		System.out.println("Even numbers :");
		while (iterator.hasNext()) {
			int number = iterator.next();
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

	}

}
