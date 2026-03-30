package com.javamethods;

//java complier will create default constructor for you .
import java.util.Scanner;

public class Methods6 {

	public static void main(String[] args) {
		System.out.println("main method ended");

//		in scanner class no no-arg constructor, so we are unable to create object for scanner directly
//		so we must need to pass arguments.

//		constructs a new scanner that produces values scanned from the specified input stream
//		to read the elements form console thats why we ares using scanner class.

		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee age : ");
		int age = sc.nextInt();

		System.out.println("enter your first name : ");
		String fname = sc.next();

		System.out.println("enter your last name :  ");
		String lname = sc.next();

		Methods6 me = new Methods6();
		me.getEmployeeName(fname, lname);

		sc.close();

	}

	void getEmployeeName(String fn, String ln) {
		System.out.println("the full name of employee is : " + fn + " " + ln);
	}

}
