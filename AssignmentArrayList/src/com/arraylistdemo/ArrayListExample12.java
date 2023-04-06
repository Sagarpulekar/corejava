package com.arraylistdemo;

import java.util.ArrayList;

public class ArrayListExample12 {
	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");
		colors.clear();

		System.out.println("Number of elements after emptying: " + colors.size());

	}

}
