package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample14 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"));
		ArrayList<String> sublist = new ArrayList<String>(Arrays.asList("Green", "Purple"));

		if (colors.containsAll(sublist)) {
			System.out.println("Sublist found ");
		} else {
			System.out.println("Sublist not found ");
		}

	}

}
