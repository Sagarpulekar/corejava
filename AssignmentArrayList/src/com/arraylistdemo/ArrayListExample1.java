package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {

		ArrayList List = new ArrayList();

		List.add(0, new Integer(10));
		List.add(1, "Hello World");

		System.out.println(List);

		/*
		 * System.out.println("Each element of ArrayList:"); for (int i = 0; i <
		 * List.size(); i++) { Object value = List.get(i); System.out.println(value); }
		 * 
		 * System.out.println("Content of ArrayList:"); for (int i = 0; i < List.size();
		 * i++) { Object value = List.get(i); if (value instanceof Integer) {
		 * System.out.println("Integer: " + (Integer) value); } else if (value
		 * instanceof String) { System.out.println("String: " + (String) value); } }
		 */

	}

}
