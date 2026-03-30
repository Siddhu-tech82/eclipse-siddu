package com.operators;

//== vs equals method
//comparison operator : ==  < <= >  >= !=
//All comparison operators will give the result of boolean values
//whenever we have primitive data types, == operator checks the content if the content is same it will return true
//whenever we are working with object data types, == operators not checks the content it checks the addresses of the object
public class TestComparison1 {

	public static void main(String[] args) {

		Integer i1 = 127;
		Integer i2 = 127;

		Integer i3 = 200;
		Integer i4 = 200;

		System.out.println(i1 == i2);
		System.out.println(i3 == i4);

		System.out.println("****************************************");

		// string literals are storing into string constant pool
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1 == s2);

		// this is called : String object with new keyword.
		String s3 = new String("siddhu");
		String s4 = new String("siddhu");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));

		System.out.println("---------------------------------");

		int i = 10;
		int j = 10;

		System.out.println(i == j);// true

		float f1 = 10.5F;
		double f2 = 10.5;

		System.out.println(f1 == f2);// true

		char c = 'A';
		char c1 = (char) 65;
		System.out.println(c == c1);

	}

}
