package com.logicalstatements;

import java.util.Scanner;

public class AgeExample {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  age");

		int age = sc.nextInt();

		if (age > 60) {
			System.out.println("you are senior citizen");
		} else if (age > 36 && age < 60) {
			System.out.println("you are a middle age");
		} else if (age > 20 && age < 35) {
			System.out.println("you are young man");
		} else if (age > 13 && age < 19) {
			System.out.println("you are a teen age");
		} else if (age > 6 && age < 12) {
			System.out.println("you are a child");
		} else {
			System.out.println("you are a kid");
		}
	}

}
