package com.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class MethodArrayList {
	public static void main(String[] args) {
		ArrayList<String> stud = new ArrayList<>();
		stud.add(null);
		stud.add("sagar");
		stud.add("bhushan");
		stud.add("pritish");
		stud.add("suyog");
		stud.add("vivek");
		System.out.println(stud);

		stud.add(4, "omkar");
		System.out.println("AFTER ADDING OMKAR");
		System.out.println(stud);

		stud.add("yashank");
		System.out.println("AFTER ADDING YASHANK");
		System.out.println(stud);

		ArrayList<String> stud1 = new ArrayList<>();
		stud1.add("uday");
		stud1.add("rohit");
		stud1.add("tejas");

		System.out.println("AFTER ADDING UDAY,ROHIT,TEJAS");
		System.out.println(stud1);
		System.out.println("AFTER ADDING COLLECTION");
		stud.addAll(stud1);
		System.out.println(stud);

		System.out.println("AFTER REMOVING TEJAS AND ROHIT");
		stud.remove("tejas");
		stud.remove("rohit");
		System.out.println(stud);

		System.out.println("AFTER REMOVING STUD1 FROM STUD");
		stud.removeAll(stud1);
		System.out.println(stud);

		System.out.println("AFTER RETAIN ALL");
		stud.retainAll(stud1);
		System.out.println(stud);

		System.out.println("size" + stud.size());
		System.out.println("Empty:-" + stud.isEmpty());

		ArrayList<String> stud2 = new ArrayList<>();
		stud2.add("uday");
		stud2.add("rohit");
		stud2.add("tejas");
		stud2.add("sagar");
		stud2.add("bhushan");
		stud2.add("pritish");
		stud2.add("suyog");
		stud2.add("bhushan");
		System.out.println(stud2);

		List<String> List1 = stud2.subList(1, 3);
		System.out.println(List1);
		System.out.println("Contains bhushan" + stud2.contains("bhushan"));
		for (int i = 0; i < stud2.size(); i++) {
			if (stud2.get(i) == "bhushan") {
				stud2.remove(i);
			}
		}
		System.out.println(stud2);

		stud2.add("sagar");
		System.out.println(stud2);

		String str = null;
		for (String s : stud2) {
			if (s.equals("sagar")) {
				str = stud2.remove(stud2.indexOf(s));
				System.out.println(stud2);
			}
		}
	}

}
