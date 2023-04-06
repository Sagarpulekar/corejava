package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question6 {

	public class HashMapExample {
		public static void main(String[] args) {

			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("key1", 1);
			map.put("key2", 2);
			map.put("key3", 3);
			map.put("key4", 4);

			for (String key : map.keySet()) {
				map.remove(key);
			}

			System.out.println("The size of the map after removing all entries: " + map.size());
		}
	}

}
