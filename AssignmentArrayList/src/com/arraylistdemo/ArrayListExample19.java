package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample19 {

	public static void main(String[] args) {

		Collection<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		boolean isEmpty = list.isEmpty();

		if (isEmpty) {
			System.out.println(" is empty");
		} else {
			System.out.println("is not empty");
		}

	}

}
