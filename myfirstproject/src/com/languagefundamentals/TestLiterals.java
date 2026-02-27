package com.languagefundamentals;

public class TestLiterals {

	public static void main(String[] args) {
		
//		Hexa Decimal Literals : Base is 16 --> 0 to 9 & a-f or A-F --> a=10,b=11
//		Hexa Decimal Literals we can represent with 0X or 0x
		
		int a7 = 0x123;
		System.out.println(a7);
//		1*16^2 +2*16^1+3*16^0 = 256 +32+3 = 291
		
		
		int a8 = 0x234;
		System.out.println(a8);

		// Decimal literals : base is 10 --> 0 t0 9 numbers we can store here.
		int a1 = 123;
		int a2 = 56789;
		System.out.println("a1 :"+ a1);
		System.out.println("a2 :"+ a2);

//		octal literals : any number starts with 0 will consider as octal.
//		Base is 8 --> 0 to 7 numbers we can store here.

		int a3 = 0123;
//		1*8^2 +2*8^1 +3*8^0 =64 +16 + 3 = 83 
		System.out.println("a3 : "+ a3);

		int a4 = 0345;
		System.out.println("a4 :"+ a4);

	}

}
