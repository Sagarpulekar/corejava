package com.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortingItemListwithComparator {

	public static void main(String[] args) {
		ArrayList<Item2> itemlist = new ArrayList<>();
		itemlist.add(new Item2(101, 60, "sugar"));
		itemlist.add(new Item2(2101, 30, "kitkat"));
		itemlist.add(new Item2(100, 30, "pen"));
		itemlist.add(new Item2(104, 30, "deo"));
		itemlist.add(new Item2(105, 150, "basket"));
		itemlist.add(new Item2(106, 200, "wheat"));
		System.out.println("Before Sorting");
		for (Item2 i : itemlist) {
			System.out.println(i);
		}
		System.out.println("After Sorting in Ascending order of price then by name");
		Collections.sort(itemlist, new Item2());
		for (Item2 i : itemlist) {
			System.out.println(i);
		}
	}

}
