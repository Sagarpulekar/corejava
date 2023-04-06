package com.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortingItemListwithComparable {

	public static void main(String[] args) {
		ArrayList<Item> itemlist = new ArrayList<>();
		itemlist.add(new Item(101, 60, "sugar"));
		itemlist.add(new Item(101, 25, "kitkat"));
		itemlist.add(new Item(100, 30, "pen"));
		itemlist.add(new Item(104, 110, "deo"));
		itemlist.add(new Item(105, 150, "basket"));
		itemlist.add(new Item(106, 200, "wheat"));
		System.out.println("Before Sorting");
		for (Item i : itemlist) {
			System.out.println(i);
		}
		System.out.println("After Sorting using id");
		Collections.sort(itemlist);
		for (Item i : itemlist) {
			System.out.println(i);
		}

	}
}
