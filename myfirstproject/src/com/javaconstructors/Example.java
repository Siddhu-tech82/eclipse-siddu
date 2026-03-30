package com.javaconstructors;

public class Example {
	String cityname;
	String villagename;
	int pincode;

	Example(String cityname, String villagename, int pincode) {
		this.cityname = cityname;
		this.villagename = villagename;
		this.pincode = pincode;

		System.out.println("parametrized constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Example ex = new Example("warangal", "nekkonda", 506122);
		ex.display();

		Example e = new Example("hyderabad", "sr nagar", 506100);
		e.display();

		System.out.println("main method ended");

	}

	void display() {
		System.out.println("cityname    : " + cityname);
		System.out.println("villagename : " + villagename);
		System.out.println("pincode     : " + pincode);

	}

}
