package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SupplierItemHashMap {
	public static void main(String[] args) {
		ArrayList<Item> s1Items = new ArrayList<Item>();
		s1Items.add(new Item(1, "pendrive"));
		s1Items.add(new Item(2, "hddhardisk"));
		s1Items.add(new Item(3, "sddhardisk"));

		ArrayList<Item> s2Items = new ArrayList<Item>();
		s2Items.add(new Item(4, "cpu"));
		s2Items.add(new Item(5, "monitor"));
		s2Items.add(new Item(6, "keyboard"));

		ArrayList<Item> s3Items = new ArrayList<Item>();
		s3Items.add(new Item(7, "laptop dell"));
		s3Items.add(new Item(8, "laptop hp"));
		s3Items.add(new Item(9, "laptop lenovo"));

		ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
		supplierList.add(new Supplier(101, "s1", s1Items));
		supplierList.add(new Supplier(102, "s2", s2Items));
		supplierList.add(new Supplier(103, "s3", s3Items));

		HashMap<Integer, Supplier> sMap = new HashMap<Integer, Supplier>();
		for (Supplier s : supplierList) {
			sMap.put(s.regNo, s);
		}
		int eRegNo = 101;
		Item newItem1 = new Item(10, "laptop cooling fan");
		Item newItem2 = new Item(11, "laptop covr");
		if (sMap.containsKey(eRegNo)) {
			Supplier eSupplier = sMap.get(eRegNo);
			eSupplier.itemList.add(newItem1);
			eSupplier.itemList.add(newItem2);
			sMap.put(eRegNo, eSupplier);
		} else {
			String newSupplierName = "New Supplier";
			ArrayList<Item> newSupplierItems = new ArrayList<Item>(Arrays.asList(newItem1, newItem2));
			Supplier newSupplier = new Supplier(eRegNo, newSupplierName, newSupplierItems);
			sMap.put(eRegNo, newSupplier);
		}
		//// sorting by regno
		HashMap<Integer, Supplier> RegNo = new HashMap<Integer, Supplier>(sMap);
		System.out.println("Sorted by regno:");
		for (Map.Entry<Integer, Supplier> entry : RegNo.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue().sName);
		}

		LinkedHashMap<String, Supplier> sortedBySName = new LinkedHashMap<>();
		for (Map.Entry<String, Supplier> entry : entries) {
			sortedBySName.put(entry.getKey(), entry.getValue());
		}

		// Print sorted maps
		System.out.println("Sorted by regNo:");
		for (Entry<Integer, Supplier> entry : RegNo.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().sName);
		}

		System.out.println("Sorted by sName:");
		for (Map.Entry<String, Supplier> entry : sortedBySName.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().sName);
		}
	}

}
