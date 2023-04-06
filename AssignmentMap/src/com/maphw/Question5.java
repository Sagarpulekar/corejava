package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question5 {

	public class HashMapExample {
		public static void main(String[] args) {

			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("key1", 1);
			map.put("key2", 2);
			map.put("key3", 3);
			map.put("key4", 4);

			Integer value = map.remove("key3");
			if (value != null) {
				System.out.println("The value for key3 was: " + value);
			} else {
				System.out.println("Key3 was not found in the map");
			}

			System.out.println("The contents of the map after removing key3:");
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}

}
