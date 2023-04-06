package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question12 {
	public static void main(String[] args) {
		Map<Integer, Map<String, String>> maplist = new HashMap<>();

		Map<String, String> Map1 = new HashMap<>();
		Map1.put("sam", "sagar");
		Map1.put("ram", "shyam");

		maplist.put(1, Map1);

		Map<String, String> Map2 = new HashMap<>();
		Map2.put("bhushan", "pritish");
		Map2.put("sarvesh", "shree");

		maplist.put(2, Map2);

		for (Map.Entry<Integer, Map<String, String>> entry : maplist.entrySet()) {
			Integer key = entry.getKey();
			Map<String, String> Map = entry.getValue();

			System.out.println("Key: " + key);

			for (Map.Entry<String, String> Entry : Map.entrySet()) {
				String Key = Entry.getKey();
				String Value = Entry.getValue();

				System.out.println("   Key: " + Key + ",  Value: " + Value);
			}
		}
	}
}
