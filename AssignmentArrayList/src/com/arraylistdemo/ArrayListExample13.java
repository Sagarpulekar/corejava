package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample13 {
	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");
		String colorToFind = "Blue";
		if (colors.contains(colorToFind)) {
			System.out.println(colorToFind + " found ");
		} else {
			System.out.println(colorToFind + " not found ");
		}

	}

}
