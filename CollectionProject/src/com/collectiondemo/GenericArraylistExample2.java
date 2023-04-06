package com.collectiondemo;

import java.util.ArrayList;

public class GenericArraylistExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list); // list will be empty

		list.add(28);
		list.add((int) 34800.50);
		list.add(new Integer(29));
		list.add(28);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			int data = list.get(i);
			list.set(i, data + 5);
		}
		System.out.println(list);
	}

}
