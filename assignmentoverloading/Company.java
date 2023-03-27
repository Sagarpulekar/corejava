package com.assignmentoverloading;

public class Company {
	public String buildingName;
	public String area;
	public String city;
	public String state;
	public int pinCode;

	public void address(String buildingName, String area, String city, String state, int pinCode) {

		this.buildingName = buildingName;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	void display() {
		System.out.println("COMPANY ADDRESS:-");
		System.out.println("Building Name:-" + buildingName + "\nArea:-" + area + "\nCity:-" + city + "\nState:-"
				+ state + "\nPincode:-" + pinCode);
	}

}
