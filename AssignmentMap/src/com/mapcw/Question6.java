package com.mapcw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question6 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);
		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println("Key: " + key);
		}
	}
}
