package com.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleByThree {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 6, 9, 12, 13, 15, 18));
		ArrayList<Integer> divisibleByThree = findDivisibleByThree(numbers);
		System.out.println("Original array: " + numbers);
		System.out.println("Divisible by three: " + divisibleByThree);
	}

	public static ArrayList<Integer> findDivisibleByThree(ArrayList<Integer> numbers) {
		ArrayList<Integer> divisibleByThree = new ArrayList<Integer>();
		for (Integer num : numbers) {
			if (num % 3 == 0) {
				divisibleByThree.add(num);
			}
		}
		return divisibleByThree;
	}
}
