package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("key1", 1);
		map1.put("key2", 2);
		map1.put("key3", 3);
		map1.put("key4", 4);

		Map<String, Integer> map2 = new HashMap<String, Integer>();

		map2.putAll(map1);

		System.out.println("Destination Map:");
		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
