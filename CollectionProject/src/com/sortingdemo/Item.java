package com.sortingdemo;

public class Item implements Comparable<Item> {

	int itemId;
	float itemPrice;
	String itemName;

	public Item(int itemId, float itemPrice, String itemName) {
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
	public int compareTo(Item o) {
		if (itemId < o.getItemId()) {
			return -1;
		} else if (itemId > o.getItemId()) {
			return 1;
		} else {
			return 0;
		}
	}
}
