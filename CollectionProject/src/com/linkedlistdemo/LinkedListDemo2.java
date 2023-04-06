package com.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("sagar");
		list1.add("bhushan");
		list1.add("pritish");
		list1.add("sam");
		list1.add("shree");
		System.out.println(list1);

		list1.add("chinmay"); // added at last
		list1.addFirst("java"); // added at first
		list1.addLast("python"); // added at last
		System.out.println(list1);

		list1.offer("angular"); // added at last
		System.out.println(list1);

		list1.remove();
		System.out.println(list1);// it removes 1st element from queue

		list1.poll();
		System.out.println(list1);// it removes 1st element from queue

		LinkedList<String> lan = new LinkedList<>();
		// System.out.println(lan);
		lan.add("a");
		lan.add("b");
		lan.add("c");
		list1.add("a");
		System.out.println(list1);
		list1.offerFirst("Sorting");
		System.out.println(list1);// add element at the first
		System.out.println(list1.element()); // gives only first element print
		System.out.println(list1.getFirst()); // gives only first element print
		System.out.println(list1.peekFirst());// method retrieves first element , but does not remove
		System.out.println(list1.peekLast());// method retrieves last element, but does not remove
		System.out.println(list1.pollFirst()); // removes first element
		System.out.println(list1.pollLast());// removes last element
		list1.push("Devops");// add element to first
		System.out.println(list1);
		System.out.println(list1.pop());// removeFirst()
		Object[] l1 = list1.toArray();// Linked list to To Array by using toArray();
		for (Object o1 : l1)
			System.out.println(o1);
		System.out.println(list1.size());

		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.print("\nUsing Iterator Print    " + itr.next());
		}

	}
}
