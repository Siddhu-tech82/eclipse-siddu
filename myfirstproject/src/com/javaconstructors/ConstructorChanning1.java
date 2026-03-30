package com.javaconstructors;

//Note : super() is used to invoke parent class constructor.
class Animal1 {
	int age;
	String name;

	Animal1() {
		System.out.println("ANIMAL 1 arg constructor called");
	}

}

class Monkey extends Animal1 {

	Monkey() {
		super();
		System.out.println("MONKEY no arg constructor called");

	}

}

public class ConstructorChanning1 {

	public static void main(String[] args) {

		System.out.println("main method started");

		Monkey m = new Monkey();

		System.out.println("main method ended");

	}

}
