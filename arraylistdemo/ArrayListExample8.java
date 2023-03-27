package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample8 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");
		colors.clear();

		System.out.println("After Removing all ArrayList is:");
		for (String color : colors) {
			System.out.println(color);// empty
		}

	}

}
