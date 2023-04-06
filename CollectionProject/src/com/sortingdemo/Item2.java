package com.sortingdemo;

import java.util.Comparator;

public class Item2 implements Comparator<Item2> {

	int itemId;
	float itemPrice;
	String itemName;

	public Item2() {

	}

	public Item2(int itemId, float itemPrice, String itemName) {
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String toString() {
		return "Item Id:-" + itemId + "Item Price:-" + itemPrice + "Item Name:-" + itemName;
	}

	@Override
	public int compare(Item2 o1, Item2 o2) {
		if (o1.itemPrice < o2.itemPrice)
			return -1;
		else if (o1.itemPrice > o2.itemPrice)
			return 1;
		else
			return o1.itemName.compareTo(o2.itemName);
	}
}
