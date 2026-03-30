package com.javaconstructors;

import java.util.Scanner;

public class CarRentals {
	Scanner sc = new Scanner(System.in);

	void Welcome() {
		String s = "Zoom Car Rentals ";
		System.out.println("welcome to the :" + s);
	}

	double dailyRent(int d) {
		return (d * 1500);

	}

	double insurancefee() {
		return 500;
	}

	void show() {
		Welcome();
		System.out.println("how many days you want sir ");
		int i = sc.nextInt();
		System.out.println("the cost of the car rent total days is :" + dailyRent(i));
		System.out.println("the insurance fee for the car is :" + insurancefee());
		System.out.println("the total bill is :" + (dailyRent(i) + insurancefee()));
	}

	public static void main(String[] args) {

		System.out.println("main method started");

		CarRentals cr = new CarRentals();
		cr.show();

	}

}
