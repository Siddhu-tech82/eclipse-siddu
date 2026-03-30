package com.javamethods;

public class Methood {
	static int c = 60;

	static void siddhu(int a, int b) {
		int c = a + b;
		System.out.println(c);
		ramu(c, 21);

	}

	static void ramu(int a, int b) {

		System.out.println(c);
	}

	static void hello(int a, int b) {
		int c = a - b;
		System.out.println(c);
		welcome(c, 20);
	}

	static void welcome(int a, int b) {

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Methood m = new Methood();

		siddhu(10, 20);
		hello(250, 200);

	}

}
