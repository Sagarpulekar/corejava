package com.linkedlistdemo;

import java.util.LinkedList;

public class InsertElementAtFirstAndLastPositionInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");
		// INSERTING element grape at the first position
		List.addFirst("grape");

		// inserting new element peach at the last position
		List.addLast("peach");
		System.out.println(List);

	}

}
