package com.linkedlistdemo;

import java.util.LinkedList;

public class GetFirstElementLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");

		String firstElement = list.getFirst();
		System.out.println("First Element: " + firstElement);
		System.out.println("Linked List: " + list);
	}
}
