package com.javamethods;

import java.util.Scanner;

public class Methods8 {

	static String showName(String name) {
		return name;
	}

	static int showAge(int age) {
		return age;
	}

	static double voidSalary(double salary) {
		return salary;

	}

	static char displayGender(char c) {
		return c;
	}
	
	static int method1() {
		return 'A';
	}

	public static void main(String[] args) {

		System.out.println("main mehtod started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the name");
		String nm = sc.next();

		System.out.println("enter the age");
		int age = sc.nextInt();

		System.out.println("enter the salary");
		double salary = sc.nextDouble();

		System.out.println("enter the gender");
		char gender = sc.next().charAt(0);// method chaining

		System.out.println(showName(nm));
		System.out.println(showAge(age));
		System.out.println(voidSalary(salary));
		System.out.println(displayGender(gender));
		System.out.println(method1());
		
		sc.close();
		System.out.println("main method ended");

	}

}
