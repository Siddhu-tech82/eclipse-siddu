package com.loops;

public class ForLoop {

	public static void main(String[] args) {
		// i = i+1
		// step1 : i = 1
//				--------------Repeat--------------------
		// step2 : i<5 condition check
		// step3 : statements execution inside the loop
		// step4 : increment or decrement

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " ");
		}

		System.out.println("reverse order ");

		for (int i = 10; i >= 0; i--) {
			System.out.println(i);

		}
	}

}
