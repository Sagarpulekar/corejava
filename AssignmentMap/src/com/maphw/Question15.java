package com.maphw;

import java.util.HashMap;

public class Question15 {

	public static void main(String[] args) {
		// create a HashMap
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Apple");
		map.put(3, "Cherry");
		map.put(5, "berry");

		int key = 2;
		Integer nextKey = ((Object) map).higherKey(key);

		// print the result
		if (nextKey != null) {
			System.out.println("Least key strictly greater than " + key + ": " + nextKey);
		} else {
			System.out.println("There is no key strictly greater than " + key);
		}
	}
}
