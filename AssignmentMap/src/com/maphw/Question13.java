package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question13 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Alice");
		map1.put(2, "Bob");
		map1.put(3, "Charlie");
		map1.put(4, "David");
		Map<Integer, String> m = map1;

		System.out.println(m);
	}
}
