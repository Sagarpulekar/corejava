package com.mapcw;

import java.util.HashMap;
import java.util.Map;

public class Question4 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(new Integer(1), new Integer(1));
		map.put(new Integer(2), new Integer(2));
		map.put(new Integer(3), new Integer(3));
		map.put(new Integer(4), new Integer(4));

		int size = map.size();

		// Print the size of the map
		System.out.println("Size of the map: " + size);
	}
}
