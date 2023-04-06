package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class NegativeNumberAtEnd {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(-9);
		numbers.add(-3);
		numbers.add(5);
		numbers.add(-7);
		numbers.add(10);
		numbers.add(12);
		ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
		ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) >= 0) {
				sortedNumbers.add(numbers.get(i));
			} else {
				negativeNumbers.add(numbers.get(i));
			}
		}

		Collections.sort(negativeNumbers);

		sortedNumbers.addAll(negativeNumbers);

		for (int i = 0; i < sortedNumbers.size(); i++) {
			System.out.print(sortedNumbers.get(i) + " ");
		}
	}
}
