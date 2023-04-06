package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question18 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		map.put(4, "orange");
		map.put(5, "erry");

		int fromKey = 2;
		int toKey = 4;
		Map<Integer, String> subMap = ((Map<Integer, String>) map).subMap(fromKey, toKey);

		System.out.println("Portion of the map whose keys range from " + fromKey + " (inclusive) to " + toKey
				+ " (exclusive): " + subMap);
	}
}
