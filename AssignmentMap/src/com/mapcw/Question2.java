package com.mapcw;

import java.util.HashMap;
import java.util.Map;

public class Question2 {

	public static void main(String[] args) {
		Map map = new HashMap();

		map.put("key1", new Integer(123));

		map.put("key2", "value2");
		System.out.println(
				"HashMap with String key and Integer value at 0th location and String key and Integer value at 1st location:");
		for (Object key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
	}
}
