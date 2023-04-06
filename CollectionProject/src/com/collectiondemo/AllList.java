package com.collectiondemo;

import java.util.LinkedList;

public class AllList {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("sagar");
		list1.addFirst("sau");
		list1.offerFirst("sam");
		list1.add(2, "samm");
		list1.addLast("sauu");
		list1.offerLast("mamama");
		System.out.println(list1);

		LinkedList<String> list2 = new LinkedList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		System.out.println(list2);
		list2.addAll(list1);

	}

}
