package com.map;

import java.util.Objects;

public class Department {
	private int id;
	private String name;

	public Department(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Department department = (Department) obj;
		return id == department.id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "\n";
	}

}
