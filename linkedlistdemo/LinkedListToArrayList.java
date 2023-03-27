package com.linkedlistdemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");
		ArrayList<String> List1 = new ArrayList<>(List);

		System.out.println("Elements of the Array List:");
		for (String element : List1) {
			System.out.println(element);

		}
	}

}
