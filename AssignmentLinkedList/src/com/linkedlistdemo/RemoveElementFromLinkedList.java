package com.linkedlistdemo;

import java.util.LinkedList;

public class RemoveElementFromLinkedList {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");
		List.remove("banana");

		System.out.println(List);
	}

}
