package com.logicalstatements;

import java.util.Scanner;

public class Example3Logical {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a value :");
		int a = sc.nextInt();

		System.out.println("enter b value :");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("a number is  big : " + a);

		} else {
			System.out.println("b number is  big : " + b);
		}
	}

}
