package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample7 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");
		colors.remove("Green");

		System.out.println("After Removing ArrayList is:");
		for (String color : colors) {
			System.out.println(color);
		}

	}

}
