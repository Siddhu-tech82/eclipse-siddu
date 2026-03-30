package com.operators;

public class TestAssignmentOperators {
	public static void main(String[] args) {

		int result = 0;
		double a = 5.5;
//		left side content is always a variable.

//		right side constent is always a value.

//		result = result +a;// type mismatch : cannot convert from double to int.

		result += a;// result = result +a;
		System.out.println(result);//5
		
		double b = 2.9;
//		result = result -b; type mismatch we cannot convert from double to int.
		result = (int ) (result -b);
		System.out.println(result);

	}
}
