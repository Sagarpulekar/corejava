package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question11 {

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

		System.out.println(maplist.get(1).get("sagar"));
		System.out.println(maplist.get(2).get("pritish"));
	}
}
