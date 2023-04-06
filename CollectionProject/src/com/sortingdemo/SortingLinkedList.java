package com.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SortingLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(52);
		num.add(50);
		num.add(48);
		num.add(52);
		num.add(40);
		num.add(70);
		System.out.println(num);
		Collections.sort(num);
		System.out.println("AFTER SORTING");
		System.out.println(num);

		System.out.println("Descending order");
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);

		System.out.println("----------");
		Collections.sort(num);
		Collections.reverseOrder();
		System.out.println(num);

		Collections.sort(num);
		Collections.reverse(num);
		System.out.println(num);

		System.out.println("LINKED LIST");
		LinkedList<String> names = new LinkedList<>();
		names.add("sagar");
		names.add("bhushan");
		names.add("pritish");
		names.add("suyog");
		names.add("omkar");
		System.out.println(names);
		Collections.sort(names);
		System.out.println("After Sorting:-" + names);

		System.out.println("REVERSE");
		Collections.sort(names);
		Collections.reverse(names);
		System.out.println(names);

		System.out.println("REVERSE 1");
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);

	}

}
