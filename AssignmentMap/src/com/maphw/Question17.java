package com.maphw;

import java.util.TreeMap;

public class Question17 {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(1, "Apple");
		map.put(3, "Cherry");
		map.put(5, "berry");

		int key = 4;
		Integer previousKey = map.lowerKey(key);

		if (previousKey != null) {
			System.out.println("Greatest key strictly less than " + key + ": " + previousKey);
		} else {
			System.out.println("There is no key strictly less than " + key);
		}
	}
}
