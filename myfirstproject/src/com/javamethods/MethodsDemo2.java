package com.javamethods;

//1) no argument + no return type
//
public class MethodsDemo2 {

	static void addition() {
		int a = 20;
		int b = 20;
		System.out.println(a + b);
	}

	static void subtraction() {
		int a = 25;
		int b = 14;
		System.out.println(a - b);
	}

	static void multiplication() {
		int a = 25;
		int b = 14;
		System.out.println(a * b);

	}

	static void division() {
		int a = 352;
		int b = 4;
		System.out.println(a / b);

	}

	static void modulus() {
		int a = 254;
		int b = 34;
		System.out.println(a % b);

	}
	

	public static void main(String[] args) {

		System.out.println("main method started");
		
		MethodsDemo2 md = new MethodsDemo2();
		md.addition();
		md.subtraction();
		md.multiplication();
		md.division();
		md.modulus();
		
		
		
		
		
		
		
	}

}
