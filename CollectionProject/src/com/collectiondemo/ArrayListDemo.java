package com.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(95);
		list1.add(90);
		list1.add(80);
		list1.add(75);

		for (int i = 0; i < list1.size(); i++) {
			int data = list1.get(i) + 5;
			list1.set(i, data);
		}
		for (Integer l : list1) {
			System.out.println(l);
		}
	}

}
