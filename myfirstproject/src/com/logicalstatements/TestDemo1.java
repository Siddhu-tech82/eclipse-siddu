package com.logicalstatements;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		if (num % 2 == 0) {

			System.out.println("the given number is even ");
			System.out.println("yes it even number");
		}

		else {
			System.out.println("the given number is odd ");
			System.out.println("yes its odd number");
		}
		sc.close();

	}

}
