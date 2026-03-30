package com.logicalstatements;

import java.util.Scanner;

//wap to calculate the values using switch cases
public class SwitchCaseProgram {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();

		System.out.println("enter a number");
		int b = sc.nextInt();

		System.out.println("enter a symbol to proceed to calculate :");
		String symb = sc.next();

		switch (symb) {

		case "+" -> {
			System.out.println("addition :");
			System.out.println(a + b);
		}
		case "-" -> {
			System.out.println("subtraction : ");
			System.out.println(a - b);

		}
		case "*" -> {
			System.out.println("multiplication : ");
			System.out.println(a * b);
		}
		case "%" -> {
			System.out.println("modulus to find remainder: ");
			System.out.println(a % b);
		}
		case "/" -> {
			System.out.println("divison to find quotient : ");
			System.out.println(a / b);
		}
		default -> System.out.println("invalied symbol to proceed  !!");

		}
	}

}
