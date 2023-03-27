package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample9 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");

		colors.retainAll(Arrays.asList("Red", "Green", "Blue"));

		System.out.println("Retain of RED,GREEN,BLUE IN ArrayList:");
		for (String color : colors) {
			System.out.println(color);
		}

	}

}
