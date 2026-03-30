package com.logicalstatements;

import java.util.Scanner;

public class LogicalExample6 {

	public static void main(String[] args) {
		System.out.println("main method ended");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your age ");
		int age = sc.nextInt();

		System.out.println("do you have license..? ");
		boolean hasLicense = sc.nextBoolean();

		if (age > 18) {
			if (hasLicense) {
				System.out.println("are you indain");
				boolean areYouIndian = sc.nextBoolean();
				if (areYouIndian) {
					System.out.println("you are eligible for driving");

				} else {
					System.out.println("your age &  License is good to go  ! but you dont have a citizenship !!");
				}

			} else {
				System.out.println("your age is okay to proceed but you must need to provide the license ");
			}
		} else {
			System.out.println("you are not eligible for driving");
		}

	}

}
