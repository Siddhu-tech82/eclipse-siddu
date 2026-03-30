package com.javaconstructors;

public class Car {

	String model;
	String brand;
	double price;
	String color;

	Car() {

	}

	Car(String model, String brand, double price, String color) {
		System.out.println("parameterized constructor");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Car c = new Car("SONET", "KIA", 130000, "black");
		c.details();

		System.out.println("--------------------------------");
// whenever we have parameterized constructor in a class if we want to create an object without passing any values then we must need to have no-arg constructor.
// because java compiler will not create default constructor if a class contains any other constructors.

		Car ca = new Car("benz","abc",150000,"red");// compile time error
		ca.details();
	}

	void details() {
		System.out.println("model of the car : " + model);
		System.out.println("brand of the car : " + brand);
		System.out.println("price of the car : " + price);
		System.out.println("color of the car : " + color);

		System.err.println("💻");
	}

}
