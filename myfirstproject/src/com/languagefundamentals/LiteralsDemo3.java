package com.languagefundamentals;

public class LiteralsDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started");
		// collection of characters storing into a double quotes will consider

		String s1 = "bharat";//
		String s2 = "bharat";
		String s3 = new String("murnal");// --> Heap area Directly

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

//     character can store 0 to 65535
		char c1 = 'A';// single quote characters
		char c2 = 65;// ASCII values
		char c3 = '\u0040';// unicode characters
		char c4 = 126;
		char c5 = 654;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

	}

}
