package com.maphw;

import java.util.HashMap;
import java.util.Map;

public class Question7 {
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

		Map<CustomKey, Integer> map = new HashMap<CustomKey, Integer>();
		map.put(new CustomKey("sagar", 1), 100);
		map.put(new CustomKey("sam", 2), 200);
		map.put(new CustomKey("ram", 3), 300);

		System.out.println("The contents of the map:");
		for (Map.Entry<CustomKey, Integer> entry : map.entrySet()) {
			CustomKey key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key.getName() + " (ID: " + key.getId() + ") -> " + value);
		}
	}
}
