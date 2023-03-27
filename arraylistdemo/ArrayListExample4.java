package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Java");
		list.add("Programming");

		System.out.println("ArrayList using for loop:");
		for (int i = 0; i < list.size(); i++) {
			Object value = list.get(i);
			System.out.println(value);
		}

	}

}
