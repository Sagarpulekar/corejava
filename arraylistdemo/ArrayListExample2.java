package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Hello");
		list.add("World");
		list.add("Java");
		list.add("Programming");

		System.out.println("Content of ArrayList:");
		for (int i = 0; i < list.size(); i++) {
			Object value = list.get(i);
			System.out.println(value);
		}

		list.add(2, "is");

		System.out.println("Adding element at specific index:");
		for (int i = 0; i < list.size(); i++) {
			Object value = list.get(i);
			System.out.println(value);
		}
		list.add("awesome");
		System.out.println("Adding element at end:");
		for (int i = 0; i < list.size(); i++) {
			Object value = list.get(i);
			System.out.println(value);
		}

	}

}
