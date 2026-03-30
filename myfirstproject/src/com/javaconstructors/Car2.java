package com.javaconstructors;

public class Car2 {
	String model;
	String brand;
	
	Car2(){
		System.out.println("vehicle no arg constructor called");
	}

	public Car2(String model, String brand) {
		super();
		System.out.println("vehicle class paremetrized constructor called");
		this.model = model;
		this.brand = brand;
	}


	public static void main(String[] args) {
		System.out.println("vehicle class main method started");
	}
}

class HeroHonda extends Car2 {
	
	
	public static void main(String[] args) {
		System.out.println("hero honda class main method started");
		
		HeroHonda he = new HeroHonda();
		
		System.out.println("hero honda class main method ended");
		
	}
}