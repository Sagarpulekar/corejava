package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudDeptMap {

	public static void createMap(ArrayList<Dept> a1) {
		HashMap<String, ArrayList<Student>> map = new HashMap<>();
		for (Dept d : a1) {
			String dname = d.getName();
			if (!map.containsKey(dname)) {
				map.put(dname, d.getStud());
			}
			for (Map.Entry<String, ArrayList<Student>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue());

			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student(1, "Sagar"));
		list1.add(new Student(2, "Rohit"));
		list1.add(new Student(3, "Vivek"));
		list1.add(new Student(4, "Gaurav"));
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student(1, "sagar"));
		list2.add(new Student(2, "Vaishnavi"));
		list2.add(new Student(3, "Rupali"));
		list2.add(new Student(4, "Shuruti"));
		ArrayList<Student> list3 = new ArrayList<>();
		list3.add(new Student(1, "Tejas"));
		list3.add(new Student(2, "Pritish"));
		list3.add(new Student(3, "Bhushan"));
		list3.add(new Student(4, "Suyog"));
		ArrayList<Student> list4 = new ArrayList<>();
		list3.add(new Student(1, "ram"));
		list3.add(new Student(2, "shyam"));
		list3.add(new Student(3, "sam"));
		list3.add(new Student(4, "md"));

		ArrayList<Dept> d1 = new ArrayList<>();
		d1.add(new Dept(101, "sales", list1));
		d1.add(new Dept(101, "marketing", list2));
		d1.add(new Dept(101, "qa", list3));
		d1.add(new Dept(101, "account", list4));
		createMap(d1);

	}

}