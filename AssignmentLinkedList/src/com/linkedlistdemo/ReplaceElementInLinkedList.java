package com.linkedlistdemo;

import java.util.LinkedList;

public class ReplaceElementInLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		System.out.println("Original linked list: " + list);

		list.set(1, "grape");
		System.out.println("Linked list after replacing element: " + list);
	}

}
