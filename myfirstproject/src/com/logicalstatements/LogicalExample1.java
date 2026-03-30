package com.logicalstatements;

import java.util.Scanner;

//wap to print the given age is eligible for voting or driving?
public class LogicalExample1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age : ");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("you are eligible for voting & driving !! ");
			System.out.println("congratulations !! 🤝 ");
		}

		else {
			System.out.println("you are not eligible for voting & driving ");
			System.out.println("please follow the guidelines 🚳❌🔞");
		}
		System.out.println("main method ended");

	}

}
