package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample6 {
	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");

		System.out.println("ArrayList:");
		for (String color : colors) {
			System.out.println(color);
		}

	}

}
