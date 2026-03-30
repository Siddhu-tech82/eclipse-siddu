package com.languagefundamentals;

//whenever we want to share the data to all object then will use static for data members.
//whenever the data is chaining from object to object the we keep the data members as instance
public class Student3 {

	int id = 10;
	// static variable
	static String collegeName = "vss";

	public static void main(String[] args) {
//		For local variables jvm will not provide default values
//		whenever we access local variable, the variable must be assigned otherwise we will get c
//		compile time error.
//      why local variables : to maintain temporary data.
		String collegeName = "sss";
		int id = 9;

		int x;
		x = 100;
		System.out.println(x);

		System.out.println("main method started");
//		Accessing local variable
		System.out.println(collegeName);
		System.out.println(Student3.collegeName);
//		Accessing static data
		System.out.println(id);

	}

}
