package com.javamethods;

class Employee {
	String name = "siddhu";

}

public class Methods10 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		System.out.println(e1.name);
		getEmployee(e1);
	}

	//
	static void getEmployee(Employee e1) {
		e1 = null;
		System.out.println(e1.name);

	}
}
