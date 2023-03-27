package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample16 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");

		String s = "Orange";
		colors.add(0, s);
		System.out.println("Color " + s);

		System.out.println("-----------");
		for (String color : colors) {
			System.out.println(color);
		}

	}

}
