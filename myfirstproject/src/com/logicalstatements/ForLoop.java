package com.logicalstatements;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		System.out.println("reverse order");

		for (int j = 10; j >= 1; j--) {
			System.out.println(num + " * " + j + " = " + (num * j));
		}
	}

}
