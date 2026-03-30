package com.javaconstructors;

public class Employee {
	String eid;
	String ename;
	double salary;
	long phonenumber;

	Employee() {
		System.out.println("no-arg constructor called");
		eid = "jfs-101";
		ename = "siddhu";
		salary = 66000.0;

	}

//  To Avoid ambiguity problems we must provide same name for constructor parameters
//  When we have same name we must need to use this to involve current class object data members.

	Employee(String eid, String ename, double salary) {
		System.out.println("parametrized constructor called");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;

	}

	Employee(String eid, String ename, double salary, long phonenumber) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.phonenumber = phonenumber;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Employee e = new Employee();
		e.show();

		Employee e1 = new Employee("jfs-102", "bharath", 100000);
		e1.show();

		Employee ee = new Employee("jfs-103", "arun", 80000, 6301940994L);
		ee.display();

		System.out.println("main method ended");

	}

	void show() {
		System.out.println("eid    : " + eid);
		System.out.println("ename  : " + ename);
		System.out.println("salary : " + salary);
		System.out.println("**************************************");

	}

	void display() {
		System.out.println("eid    : " + eid);
		System.out.println("ename  : " + ename);
		System.out.println("salary : " + salary);
		System.out.println("phonenumber :" + phonenumber);
		System.out.println("**************************************");

	}

}
