package com.maphw;

import java.util.Map;
import java.util.TreeMap;

public class Question16 {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(1, "Apple");
		map.put(3, "Cherry");
		map.put(5, "berry");

		int key = 4;
		Map.Entry<Integer, String> entry = map.lowerEntry(key);

		if (entry != null) {
			System.out.println(
					"Key-value mapping associated with the greatest key strictly less than " + key + ": " + entry);
		} else {
			System.out.println("There is no key strictly less than " + key);
		}
	}
}
