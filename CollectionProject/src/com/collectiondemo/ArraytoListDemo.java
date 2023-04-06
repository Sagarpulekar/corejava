package com.collectiondemo;

import java.util.Arrays;
import java.util.List;

public class ArraytoListDemo {

	public static void main(String[] args) {
		String[] str = { "music", "reading", "cooking", "riding", "dancing", "treking" };
		List<String> hobbies = Arrays.asList(str);
		System.out.println("Hobbies are:-");
		for (String h : hobbies) {
			System.out.println(h);

		}
	}

}
