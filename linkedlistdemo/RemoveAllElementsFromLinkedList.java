package com.linkedlistdemo;

import java.util.LinkedList;

public class RemoveAllElementsFromLinkedList {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");

		List.clear();
		System.out.println(List);
	}

}
