package com.maphw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question10 {

	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new HashMap<>();

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		map.put("list1", list1);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);

		map.put("list2", list2);

		for (Integer element : map.get("list1")) {
			System.out.println(element);
		}
	}
}
