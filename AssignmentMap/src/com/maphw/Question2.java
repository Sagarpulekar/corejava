package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		if (map.isEmpty()) {
			System.out.println("The map is empty");
		} else {
			System.out.println("The map is not empty");
		}
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);
		if (map.isEmpty()) {
			System.out.println("The map is empty");
		} else {
			System.out.println("The map is not empty");
		}
	}
}
