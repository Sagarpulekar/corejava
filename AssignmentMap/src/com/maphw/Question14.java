package com.maphw;

import java.util.HashMap;
import java.util.SortedMap;

public class Question14 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		map.put(4, "orange");
		map.put(5, "berry");
		int key = 3;
		boolean inclusive = true;
		SortedMap<Integer, String> portion = map.headMap(key, inclusive);
		System.out.println("Portion of map whose keys are less than or equal to " + key + ": " + portion);
	}
}
