package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

	public class HashMapExample {
		public static void main(String[] args) {

			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("key1", 1);
			map.put("key2", 2);
			map.put("key3", 3);
			map.put("key4", 4);
			if (map.containsKey("key3")) {
				System.out.println("The map contains a mapping for key3");
			} else {
				System.out.println("The map does not contain a mapping for key3");
			}

			if (map.containsKey("key5")) {
				System.out.println("The map contains a mapping for key5");
			} else {
				System.out.println("The map does not contain a mapping for key5");
			}
		}
	}

}
