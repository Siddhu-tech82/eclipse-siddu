package com.javamethods;

//1) no argument + no return type 
public class MethodsDemo1 {
	
	
// instance methods
//	no return type + no arguments
	void greet() {

		System.out.println("good morning hava a great day");
	}
	static void welcome() {
		
		System.out.println("welcome to methods");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		MethodsDemo1 md = new MethodsDemo1();
		 md.greet();//calling the method
		 
		welcome();//static methods we call directly without object creation
		//and also we can call by class name.
		MethodsDemo1.welcome();
		 
		 
//		if we want to call instance methods inside a static area, we must need to create an object
//		 of a class and we can call by using object reference variable.
		 System.out.println("main method ended");
		 

	}

}
