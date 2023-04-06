package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample18 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

		boolean containsAll = list1.containsAll(list2);

		if (containsAll) {
			System.out.println("list1 contains all the elements of list2");
		} else {
			System.out.println("list1 does not contain all the elements of list2");
		}

	}

}
