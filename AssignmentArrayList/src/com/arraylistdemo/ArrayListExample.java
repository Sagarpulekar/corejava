package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<>();

		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);

		System.out.println("Content of ArrayList where Integer is used:");
		for (int i = 0; i < integerList.size(); i++) {
			Integer value = (Integer) integerList.get(i);
			System.out.println(value);
		}

		ArrayList<String> stringList = new ArrayList<>();

		stringList.add("Hello");
		stringList.add("World");
		stringList.add("Java");
		stringList.add("Programming");

		System.out.println("Content of ArrayList where String is used:");
		for (int i = 0; i < stringList.size(); i++) {
			String value = (String) stringList.get(i);
			System.out.println(value);
		}

	}

}
