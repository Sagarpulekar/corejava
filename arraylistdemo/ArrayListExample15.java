package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample15 {
	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");

		int index = 2;
		String AtIndex = colors.get(index);
		System.out.println("Color at index " + index + " is " + AtIndex);

	}

}
