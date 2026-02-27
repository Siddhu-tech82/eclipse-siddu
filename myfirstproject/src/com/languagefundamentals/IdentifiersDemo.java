package com.languagefundamentals;

public class IdentifiersDemo {

	static String college_name ="sri vikas degree college ";
	static int college_id =501;

	int s_id;
	String s_name;

	public static void main(String[] args) {
		System.out.println("main method started");

		IdentifiersDemo id = new IdentifiersDemo();
		System.out.println(id.s_id);
		System.out.println(id.s_name);
		id.show$();

	}

	void show$() {
		System.out.println("show method called");

	}

}
