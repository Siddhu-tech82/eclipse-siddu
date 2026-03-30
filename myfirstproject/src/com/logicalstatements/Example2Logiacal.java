package com.logicalstatements;

import java.util.Scanner;

public class Example2Logiacal {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Are you attending classes regularly? (true/false)");
		boolean areYouAttendingClassRegularly = sc.nextBoolean();

		System.out.println("Are you attending weekly tests? (true/false)");
		boolean areYouAttendingWeeklyTest = sc.nextBoolean();

		System.out.println("Are you attending mock interviews? (true/false)");
		boolean areYouAttendingMockInterview = sc.nextBoolean();

		if (areYouAttendingClassRegularly && areYouAttendingWeeklyTest && areYouAttendingMockInterview) {
			System.out.println("You will understand the classes properly & you will get a job in 6 months!!");
		} else {
			System.out.println("Try to be consistent in all activities to succeed.");
		}

		sc.close();
	}

}
