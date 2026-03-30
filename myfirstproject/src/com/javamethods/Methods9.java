package com.javamethods;

class Student {
	String name;

}

public class Methods9 {

	public static void main(String[] args) {

		System.out.println("main method strated");

		Student s1 = createStudent();
		s1.name = "ramu";
		System.out.println(s1.name);

	}
//  Factory Methods
	static Student createStudent() {
		Student s = new Student();
		return s;
	}

}
