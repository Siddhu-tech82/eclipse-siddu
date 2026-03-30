package com.logicalstatements;

import java.util.Scanner;

//wap to provide description about t-shirts..?
public class TshirtProgram {

	public static void main(String[] args) {
		System.out.println("enter t-shirt size to provide details ");

		Scanner sc = new Scanner(System.in);

		int t_shitrSize = sc.nextInt();

		switch (t_shitrSize) {

		case 36 ->{
		System.out.println("small-size T shirt");
		System.out.println("this size t shirt is good and fit for my body");
		}
		case 38 -> System.out.println("medium-size T shirt");

		case 40 -> System.out.println("Large-size T shirt");

		case 42 -> System.out.println("xtra large-size T shirt");

		default -> System.out.println("entered size T shirt is not availabe");

		}

	}

}
