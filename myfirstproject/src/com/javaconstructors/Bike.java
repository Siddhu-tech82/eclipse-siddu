package com.javaconstructors;

public class Bike {

	String brand;
	String model;
	String color;
	double price;
	double milage;
	int capacity;

	Bike(String brand, String model) {
		this(brand, model, 100000.00);
		System.out.println("TWO ARG CONSTRUCTOR CALLED");

	}

	Bike(String brand, String model, double price, String color) {
		System.out.println("FOUR ARG CONSTRUCTOR CALLED");
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
	}

	Bike(String brand, String model, double price) {
		this(brand, model, price, "blue");
		System.out.println("THREE ARG CONSTRUCTOR CALLED");

	}

	Bike(String brand) {
		this(brand, "unknown");
		System.out.println("ONE ARG CONSTRUCTOR CALLED");

	}

	Bike() {
		this("unknown");
		System.out.println("NO ARG CONSTRUCTOR CALLED FROM BIKE");
	}

	public static void main(String[] args) {
		System.out.println("MAIN METHOD STARTED");

		Bike b1 = new Bike();
		System.out.println(b1.brand);

		System.out.println("----------------------------------------");

		Bike b2 = new Bike("HERO HONDA");
		System.out.println("brand : " + b2.brand);
		System.out.println("model :" + b2.model);

		System.out.println("----------------------------------------");

		Bike b3 = new Bike("RE", "Classic");
		b3.show();
		System.out.println("----------------------------------------");

		Bike b4 = new Bike("PULSAR", "BAJAJ", 150000, "blue");
		b4.show();

		System.out.println("------------------------------------------");
		Bike b5 = new Bike("FZ", "HIMALAYA", 20000.00, "ORANGE");
		b5.show();
	}

	void show() {
		System.out.println("model :" + model);
		System.out.println("brand :" + brand);
		System.out.println("price :" + price);
		System.out.println("color :" + color);
	}
}
