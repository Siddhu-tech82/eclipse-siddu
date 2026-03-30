package com.javaconstructors;

 class Vehiclel {
	
	Vehiclel(){
		System.out.println("vehiclel construtor created");
	}
	void Start(){
		System.out.println("vehiclel is starting from parent class");
	}
	
}
public class Car1 extends Vehiclel{
	
	Car1(){
		super();
		System.out.println("car1 construtor created");
	}
	void Start() {
		super.Start();
		System.out.println("car is starting from child class");
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Car1 c = new Car1();
		c.Start();
	}
}
