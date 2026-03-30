package com.operators;

import java.util.Scanner;

//ternary operators -->
//syntax :
//condition ? value if_true : value if_false

public class TernaryOperators {

	public static void main(String[] args) {
		
		int x =10;
		int y = 20;
		int z = 5;
		int max1 =(x>y) ?( x>z?x:z) :(y>z?y:z);
		System.out.println(max1);


		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age ? ");
		
		
		int age = sc.nextInt();
//		boolean isEligible = (age > 18) ? true : false;
		
		String isEligible =(age >18)? "yes":"no";
		
		System.out.println("the entered age is eligible ..? " + isEligible);
	}

}
