package com.linkedlistdemo;

import java.util.LinkedList;

public class GetLastElementLinkedList {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("apple");
		list.add("banana");
		list.add("orange");

		String lastElement = list.getLast();

		System.out.println("Last Element: " + lastElement);
		System.out.println("Linked List: " + list);
	}
}
