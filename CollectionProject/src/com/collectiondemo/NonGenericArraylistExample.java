package com.collectiondemo;

import java.util.ArrayList;

public class NonGenericArraylistExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list); // list will be empty
		list.add("sagar");
		list.add(28);
		list.add(34800.50);
		list.add(new Integer(29));
		System.out.println(list);
	}

}
