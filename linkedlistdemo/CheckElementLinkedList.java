package com.linkedlistdemo;

import java.util.LinkedList;

public class CheckElementLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("apple");
		list.add("banana");
		list.add("orange");
		boolean flag = list.contains("banana");

		if (flag) {
			System.out.println("The element \"banana\" exists in the linked list");
		} else {
			System.out.println("The element \"banana\" does not exist in the linked list");
		}
	}
}
