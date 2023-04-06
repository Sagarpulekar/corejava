package com.maphw;

import java.util.HashMap;
import java.util.SortedMap;

public class Question19 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		map.put(4, "Durian");
		map.put(5, "Elderberry");

		int fromKey = 2;
		int toKey = 4;
		SortedMap<Integer, String> subMap = ((SortedMap<Integer, String>) map).subMap(fromKey, toKey + 1);

		System.out.println("Portion of the map whose keys range from " + fromKey + " (inclusive) to " + toKey
				+ " (inclusive): " + subMap);
	}
}
