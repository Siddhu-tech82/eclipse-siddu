package com.languagefundamentals;

public class TypesOfVariables {
	// primitive + instance
	int id;
	// object + instance
	String name;

	// primitive + static variable
	static int collegeId = 88;

	// object + static
	static String collegename = "Vcube";

	public static void main(String[] args) {
		System.out.println("main method started");
//		object creation to access instance data members
		TypesOfVariables tv = new TypesOfVariables();
		System.out.println(tv.id);
		System.out.println(tv.name);

//		Accessing static data directly
		System.out.println(collegeId);
		System.out.println(collegename);

//		static data members we can access by using class name also.
//		sometime we need to access the static data outside of the class
//		we must need to access through class name.
//		accessing static data through class name is always recommended.

		System.out.println(TypesOfVariables.collegeId);
		System.out.println(TypesOfVariables.collegename);

//		static data we can access by using object reference variable also.
//		the static field should be accessed in a static way
		System.out.println(tv.collegeId);
		System.out.println(tv.collegename);

	}

}
