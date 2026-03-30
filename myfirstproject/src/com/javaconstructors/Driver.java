package com.javaconstructors;


class Gparent {
	void display() {
		System.out.println("welcome to hyderabad");
	}

}

class Parent extends Gparent {
	void display() {
		super.display();
		System.out.println("welcome to hyderabad");
	}

}

class Child extends Parent {
	void display() {
		super.display();
		System.out.println("welcome to hyderabad");
	}
}

public class Driver {

	public static void main(String[] args) {

		Child ch = new Child();
		ch.display();

	}

}
