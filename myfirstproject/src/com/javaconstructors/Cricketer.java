package com.javaconstructors;

//Note : In java if the program does not contain any explicit constructor
// then java complier will create a constructor name called default constructor 
//ex  : default constructor looks like below
//syntax : public Cricketer(){ }
public class Cricketer {

	int jno;
	String name;

// no-arg constructor
	Cricketer() {
		System.out.println("no-arg constructor called");
	}

	{
		System.out.println("instance block called");
	}

	
	public static void main(String[] args) {

		System.out.println("main method started");
//    the below object is created with the help of default constructor.
//    the below object is created with the help of no-arg constructor.
//	  whenever the class contains any constructor then java complier will not create
//    default constructor no we have explicit no-arg constructor
		Cricketer ck = new Cricketer();// constructor calling
		
		ck.jno = 9;
		ck.name = "sanju samson";
		
		System.out.println(ck.jno);
		System.out.println(ck.name);

		System.out.println("main method ended");

	}

}
