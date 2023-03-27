package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();

		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");
		arrayList.add("Programming");

		System.out.println("ArrayList using iterator:");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object value = iterator.next();
			System.out.println(value);
		}

	}

}
