package com.languagefundamentals;

class Student {
	int id = 101;;
	String name = "siddhu";

}

class Address {
	int falt = 124;
	String street ="srnagar";

}

public class DataType1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Student st = new Student();
		System.out.println(st.id);
		System.out.println(st.name);
		
		Address a = new Address();
		System.out.println(a.falt);
		System.out.println(a.street);
		

	}

}
