package com.javamethods;

// with argument + no return type

public class MethodDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");

		MethodDemo5 me = new MethodDemo5();
		me.greet("hi");
		me.addition(20, 40);
		me.subtraction(34, 21);

	}

	void greet(String wish) {
		System.out.println("greeting : " + wish);

	}

	void addition(int a, int b) {
		System.out.println("in addition");
		System.out.println(a + b);
	}

	void subtraction(float f, double d) {
		System.out.println("in subtraction");
		System.out.println(f - d);
	}

}
