package com.collectiondemo;

import java.util.ArrayList;

public class GenericArraylistExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list); // list will be empty

		list.add(58);
		list.add(55);
		list.add(50);
		list.add(35);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			int data = list.get(i) + 5;
			list.set(i, data);

		}
		System.out.println("AFTER ADDING 5 TO ALL:-");
		for (Integer i : list)

			System.out.println(i);
	}

}
