package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question4 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);
		Integer value = map.get("key3");
		if (value != null) {
			System.out.println("The value for key3 is: " + value);
		} else {
			System.out.println("Key3  not found");
		}

		Integer value1 = map.get("key5");
		if (value1 != null) {
			System.out.println("The value for key5 is: " + value1);
		} else {
			System.out.println("Key5 not found");
		}
	}
}