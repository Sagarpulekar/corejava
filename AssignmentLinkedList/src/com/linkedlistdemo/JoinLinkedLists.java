package com.linkedlistdemo;

import java.util.LinkedList;

public class JoinLinkedLists {

	public static void main(String[] args) {

		LinkedList<String> firstList = new LinkedList<>();

		firstList.add("apple");
		firstList.add("banana");

		LinkedList<String> secondList = new LinkedList<>();

		secondList.add("orange");
		secondList.add("grape");

		firstList.addAll(secondList);

		System.out.println("Joined Linked List: " + firstList);

	}

}
