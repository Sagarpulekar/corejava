package com.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Supplier implements Comparator<Supplier> {
	int regNo;
	String sName;
	ArrayList<Item> itemList;

	public Supplier(int regNo, String sName, ArrayList<Item> itemList) {
		this.regNo = regNo;
		this.sName = sName;
		this.itemList = itemList;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemList, regNo, sName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supplier other = (Supplier) obj;
		return Objects.equals(itemList, other.itemList) && regNo == other.regNo && Objects.equals(sName, other.sName);
	}

	@Override
	public int compare(Supplier e1, Supplier e2) {
		return e1.getsName().compareTo(e2.sName);

	}
};
