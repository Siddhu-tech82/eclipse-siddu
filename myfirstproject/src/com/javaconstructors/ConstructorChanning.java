package com.javaconstructors;

//Note: extends is the keyword to get the properties from parent class to child class.
class Animal {
	String name = "ROTWILLER";

	void show() {
		System.out.println("ANIMAL : " + name);
	}
}

class Dog extends Animal {
	String name = "GERMAN SHPERAD";

	@Override
	void show() {
		System.out.println("DOG : " + super.name);

	}
	// note: this super can use only in instance area but in static area
	// cannot use super in a static context
//	 cannot use this in a static context
//	static void display() {
//		System.out.println(super.name);
//	}

}
//what is the use of super key word: super is the keyword used to access parent class data members to child class.



public class ConstructorChanning {

	public static void main(String[] args) {

		System.out.println("main method started");

		Dog d = new Dog();
		System.out.println(d.name);
		d.show();

		Animal a = new Animal();
		System.out.println(a.name);
		a.show();

		System.out.println("main method ended");

	}

}
