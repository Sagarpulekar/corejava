package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayListElementsExample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		Collections.swap(list, 1, 3);

		System.out.println("List after swapping elements:");
		for (Integer element : list) {
			System.out.println(element);
		}

	}

}
