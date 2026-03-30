package com.javamethods;

public class ObjectCreation {

	static int x;

	ObjectCreation() {
		x = x + 1;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		ObjectCreation ex = new ObjectCreation();
		ObjectCreation e1 = new ObjectCreation();
		ObjectCreation ex2 = new ObjectCreation();
		ObjectCreation ex3 = new ObjectCreation();
		ObjectCreation ex4 = new ObjectCreation();
		ObjectCreation ex5 = new ObjectCreation();
		System.out.println(x);

		System.out.println("main method ended");

	}
}
