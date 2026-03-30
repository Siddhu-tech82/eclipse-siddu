package com.operators;

import java.util.Scanner;

public class TestOperators1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
		System.out.println("enter b number");
		int b=sc.nextInt();
		
		System.out.println("addition : " + (a+b));
		
		
		//the operator - is undefined for the argument type(s) String int
//		System.out.println("subtraction :"+ a-b);compile time error.
		
		System.out.println("subtraction : " + (a-b));
		System.out.println("multiplication : "+ a*b);
		System.out.println("division : " +a/b);
		System.out.println("modulus : " +a%b);
		
		
	}
}
