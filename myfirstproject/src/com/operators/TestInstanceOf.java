package com.operators;

public class TestInstanceOf {
// INSTANCE OF OPERATOR: to check the object reference whether it is particular children from or not.

	public static void main(String[] args) {

		Integer i = 10;
		System.out.println(i instanceof Integer);// true
		System.out.println(i instanceof Number);// true
		System.out.println(i instanceof Object);// true

//		Incompatible conditional operand types String and Integer
		String s = "siddhu";
//		System.out.println(s instanceof Integer);//compile time error

		Number n = 100;
		System.out.println(n instanceof Number);// true
		System.out.println(n instanceof Integer);// true

		Number n1 = null;
		System.out.println(n1 instanceof Number);// false
		System.out.println(n1 instanceof Integer);// false

	}

}
