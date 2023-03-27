package com.linkedlistdemo;

import java.util.LinkedList;

public class RemoveFirstElementLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");

		String firstElement = list.removeFirst();

		System.out.println("Removed First Element: " + firstElement);
		System.out.println("Modified Linked List: " + list);

	}

}
