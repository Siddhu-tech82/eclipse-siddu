package com.languagefundamentals;

public class TestDataTypes1 {
	// if we give more than byte value we will get below compile time error
	// type mismatch cannot convert from int to byte

	byte b = 127;// -128 to 127
	// by default RHS numarical value is int .
	// msb nothing but : most significant bit.
	// Type Casting : converting one data type value into another data type value.
	short s;

	int i;
	long l;

	float f;
	double d;

	char c ;
	boolean boo;

	

	public static void main(String[] args) {
		System.out.println("main method started");

		TestDataTypes1 td = new TestDataTypes1();

		System.out.println(" byte " + td.b);
		System.out.println(" short " + td.s);

		System.out.println(" int " + td.i);
		System.out.println(" long " + td.l);

		System.out.println(" float " + td.f);
		System.out.println(" double " + td.d);

		System.out.println(" char " + td.c);// char default value is empty space.
		System.out.println(" boolean " + td.boo);// by default value is false

	}

}
