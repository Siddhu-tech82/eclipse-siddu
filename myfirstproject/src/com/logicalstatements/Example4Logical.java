package com.logicalstatements;

import java.util.Scanner;

public class Example4Logical {
	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the student marks ");

		double marksP = sc.nextDouble();

		if (marksP > 100) {
			System.out.println("invalid marks percentage ");
		} else if (marksP >= 90) {
			System.out.println("Grade A 👨‍🎓");
		} else if (marksP >= 80) {
			System.out.println("Grade B ");
		} else if (marksP >= 70) {
			System.out.println("Grade C ");
		} else if (marksP > 60) {
			System.out.println("Grade D ");
		} else if (marksP >= 35) {
			System.out.println("just passed ");
		} else {
			System.out.println("Failed");
		}
		sc.close();

	}

}
