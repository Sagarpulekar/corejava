package com.mapcw;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void main(String[] args) {
		Map map1 = new HashMap();
		map1.put(new Integer(1), "one");
		map1.put(new Integer(2), "two");
		map1.put(new Integer(3), "three");

		System.out.println("HashMap with Integer keys and String values:");
		for (Object key : map1.keySet()) {
			System.out.println(key + " = " + map1.get(key));
		}

		Map map2 = new HashMap();
		map2.put("one", new Integer(1));
		map2.put("two", new Integer(2));
		map2.put("three", new Integer(3));

		System.out.println("HashMap with String keys and Integer values:");
		for (Object key : map2.keySet()) {
			System.out.println(key + " = " + map2.get(key));
		}
	}
}
