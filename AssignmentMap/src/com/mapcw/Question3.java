package com.mapcw;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;

public class Question3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		Map.Entry<Integer, String> entry1 = new SimpleEntry<Integer, String>(1, "value1");
		Map.Entry<Integer, String> entry2 = new SimpleEntry<Integer, String>(2, "value2");
		Map.Entry<Integer, String> entry3 = new SimpleEntry<Integer, String>(3, "value3");
		Map.Entry<Integer, String> entry4 = new SimpleEntry<Integer, String>(4, "value4");

		map.put(entry1.getKey(), entry1.getValue());
		map.put(entry2.getKey(), entry2.getValue());
		map.put(entry3.getKey(), entry3.getValue());
		map.put(entry4.getKey(), entry4.getValue());

		System.out.println("HashMap with Integer key and String value:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
