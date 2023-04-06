package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question8 {

	public static void main(String[] args) {

		class CustomKey {
			private String name;
			private int id;

			public CustomKey(String name, int id) {
				this.name = name;
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public int getId() {
				return id;
			}

			@Override
			public boolean equals(Object obj) {
				if (obj == this) {
					return true;
				}

				if (!(obj instanceof CustomKey)) {
					return false;
				}

				CustomKey other = (CustomKey) obj;
				return name.equals(other.name) && id == other.id;
			}

			@Override
			public int hashCode() {
				return name.hashCode() ^ id;
			}
		}

		class CustomValue {
			private String description;
			private int quantity;

			public CustomValue(String description, int quantity) {
				this.description = description;
				this.quantity = quantity;
			}

			public String getDescription() {
				return description;
			}

			public int getQuantity() {
				return quantity;
			}
		}
		Map<CustomKey, CustomValue> map = new HashMap<CustomKey, CustomValue>();
		map.put(new CustomKey("sagar", 1), new CustomValue("Item 1", 10));
		map.put(new CustomKey("ram", 2), new CustomValue("Item 2", 20));
		map.put(new CustomKey("sam", 3), new CustomValue("Item 3", 30));

		System.out.println("The contents of the map:");
		for (Map.Entry<CustomKey, CustomValue> entry : map.entrySet()) {
			CustomKey key = entry.getKey();
			CustomValue value = entry.getValue();
			System.out.println(key.getName() + " (ID: " + key.getId() + ") -> " + value.getDescription() + " (Qty: "
					+ value.getQuantity() + ")");
		}
	}
}
