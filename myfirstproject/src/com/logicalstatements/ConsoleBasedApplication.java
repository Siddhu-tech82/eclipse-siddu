package com.logicalstatements;

import java.util.Scanner;

//wap for a simple java program which can provide the possibilities for marriage matrimonial application
//for console based applicaton.
public class ConsoleBasedApplication {

	public static void main(String[] args) {

		System.out.println("welcome to vcube matrimonial website");
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me about your name :");
		String name = sc.nextLine();
		System.out.println("hello mr. " + name);
		System.out.println("can you tell how much assets you have..?");
		double assets = sc.nextDouble();
		System.out.println("enter your salary information : ");
		double salary = sc.nextDouble();

		if (assets >= 5000000 && salary >= 200000) {
			System.out.println("yes !! then we can start the conversation");

			System.out.println("enter your age :");
			int age = sc.nextInt();

			if (age <= 28 && age >= 26) {
				System.out.println("oh okay !! shall we proceed furthur ! ");

				System.out.println("can your weight ..?");
				double weight = sc.nextDouble();

				if (weight <= 70 && weight >= 65) {
					System.out.println("okay cool !! lets enter your height");

					float height = sc.nextFloat();

					if (height >= 5.4 && height <= 6.0) {
						System.out.println("okay good to go !!");

						System.out.println("do you have sibilings ...?");

						boolean sibStatus = sc.nextBoolean();
						if (!sibStatus) {
							System.out.println("okay we will get back you to soon");
						} else {
							System.out.println("ohh my god");
						}
					} else {
						System.out.println("your height is too long or too short !! not matching with our profile");
					}

				} else {
					System.out.println("you must join in gym ");
				}

			} else {
				System.out.println("sorry !! your age is not matching with your profile");
			}
		} else {
			System.out.println("you can leave for the day !! all the best");
		}

	}

}
