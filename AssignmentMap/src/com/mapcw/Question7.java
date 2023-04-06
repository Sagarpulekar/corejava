package com.mapcw;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Question7 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);

		Collection<Integer> values = map.values();

		for (Integer value : values) {
			System.out.println("Value: " + value);
		}
	}
}
