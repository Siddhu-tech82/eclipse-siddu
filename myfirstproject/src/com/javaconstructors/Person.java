package com.javaconstructors;

//person is the super class or we can call that parent class  
public class Person {
	String name;
	int age;
	long phone;

	public Person() {
		System.out.println("person no-arg constructor called");
	}

	Person(String name, int age, long phone) {
		System.out.println("person 3 argumented constructor called");
		this.name=name;
		this.age=age;
		this.phone=phone;
	}

	public static void main(String[] args) {
		System.out.println("main method started from person");
	}

}

//sub class or child class
class Customer extends Person {

	public Customer() {

		System.out.println("customer no-arg constructor called");
	}

	Customer(String name, int age, long phone) {
		super(name,age,phone);
		System.out.println("customer 3 argumented constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main method started from customer");

		Customer c1 = new Customer();
		c1.show();

		Customer c2 = new Customer("siddhu",22,7893066554L);
		c2.show();

		System.out.println("main method ended from customer");
	}
	
	void show() {
		System.err.println("************CUSTOMER INFORMATION************");
		System.out.println("name of the customer :"+name);
		System.out.println("age of the customer :"+age);
		System.out.println("contact of the customer :"+phone);
		
	}
}