package com.javamethods;

//no argument + with return type
public class MethodsDemo3 {

	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		System.out.println("the employee age    is  :" + getEmployeeAge());
		System.out.println("the employee salary is  :" + getSalary());
		System.out.println("the employee bonus  is  :" + getBonus());

		double sal = getSalary();
		double bonus = getBonus();
		System.out.println("total salary is : " + (sal + bonus));
	}

	static int getEmployeeAge() {
		int age = 22;
		return age;

	}

	static double getSalary() {
		double salary = 500000.00;
		return salary;
	}

	static double getBonus() {
		double bonus = 20000.00;
		return bonus;

	}
}
