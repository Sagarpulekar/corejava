package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample11 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");
		if (colors.isEmpty()) {
			System.out.println("It is empty");
		} else {
			System.out.println("It is not empty");
		}

	}

}
