package com.linkedlistdemo;

import java.util.LinkedList;

public class InsertElementAtEndInLinkedList {
	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");
		// inserting new element grape at the end
		List.addLast("grape");
		System.out.println(List);
	}

}
