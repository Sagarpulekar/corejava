package com.linkedlistdemo;

import java.util.LinkedList;

public class InsertElementAtFrontInLinkedList {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();

		List.add("apple");
		List.add("banana");
		List.add("orange");

		// inserting new element grape at the front
		List.addFirst("grape");
		System.out.println(List);
	}

}
