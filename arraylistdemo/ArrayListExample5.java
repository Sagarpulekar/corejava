package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample5 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Hello");
		list.add("World");
		list.add("Java");
		list.add("Programming");

		System.out.println("ArrayList using for-each loop:");
		for (Object value : list) {
			System.out.println(value);
		}

	}

}
