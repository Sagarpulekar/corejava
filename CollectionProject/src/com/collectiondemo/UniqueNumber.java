package com.collectiondemo;

import java.util.ArrayList;

public class UniqueNumber {
	public static void commonElement(ArrayList<String> commonElements, ArrayList<String> uniqueElements) {
		System.out.println("Common elements : " + commonElements);
		System.out.println("Unique elements : " + uniqueElements);

		for (int i = 0; i < commonElements.size(); i++) {
			if (commonElements.contains(uniqueElements.get(i))) {
				System.out.println(commonElements.get(i));
			}
		}
		for (int i = 0; i < uniqueElements.size(); i++) {
			if (uniqueElements.contains(commonElements.get(i))) {
				System.out.println(uniqueElements.get(i));
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("Python");
		list1.add("Angular");
		list1.add("C");
		list1.add("Html");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Java");
		list2.add("SpringBoot");
		list2.add("Devops");
		list2.add("C");
		list2.add("Html");
		commonElement(list1, list2);

	}
}
