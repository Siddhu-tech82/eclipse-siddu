package com.logicalstatements;

import java.util.Scanner;

public class WeekDayExample {

	static String getDayInfo(String day) {

		switch (day) {

		case "monday":
			return "lazy day";

		case "tuesday", "wedenseday", "thursday":
			return "noraml days";

		case "friday":
			return "weekend mode started";

		case "saturday", "sunday":
			return "weekend with holidays";

		default:
			return "entered day is invalid";
		}

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a day :");

		String day = sc.next();

		System.out.println(getDayInfo(day));

		sc.close();

	}

}
