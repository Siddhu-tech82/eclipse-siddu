package com.logicalstatements;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to vegtable & fruits market");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a category : ");
		String catg = sc.next();

		String yn = "";

		do {
			switch (catg) {

			case "vegt" -> {
				System.out.println("enter items for vegatables : ");
				String item = sc.next();

				switch (item) {
				case "tmt" -> System.out.println("tomato 🍅🍅 & the price is 20 rs per kg");
				case "ptt" -> System.out.println("potato 🥔🥔 & the price is 40 rs per kg");
				case "dmst" -> System.out.println("drum sticks & the price is 100 rs per kg");
				case "on" -> System.out.println("onion🧅🧅 & the price is 30 rs per kg");
				case "cr" -> System.out.println("carrot 🥕🥕 & the price is 25 rs per kg");
				case "cbg" -> System.out.println("cabbage 🥦🥦 & the price is 35 rs per kg");
				case "bns" -> System.out.println("beans  🫛🫛 & the price is 60 rs per kg");
				case "btr" -> System.out.println("beetroot & the price is 45 rs per kg");
				case "chk" -> System.out.println("chicken 🍗🍗 & the price is 220 rs per kg");
				case "egg" -> System.out.println("eggs 🥚🥚 & the price is 6 rs per piece & dozen cost is 84 rs ");
				default -> System.out.println("entered item is not available  ❌: ");

				}

			}

			case "fru" -> {
				System.out.println("enter items for fruits : ");
				String item = sc.next();

				switch (item) {

				case "mgr" -> System.out.println("mango 🥭🥭 & the price is 300 per kg ");
				case "org" -> System.out.println("orange  🍊🍊 & the price is 250 per kg ");
				case "apl" -> System.out.println("apple 🍎🍎 & the price is 200 rs per kg");
				case "ban" -> System.out.println("banana 🍌🍌 & the price is 60 rs per dozen");
				case "grp" -> System.out.println("grapes 🍇🍇 & the price is 120 rs per kg");
				case "pnp" -> System.out.println("pineapple 🍍🍍 & the price is 80 rs per piece");
				case "wml" -> System.out.println("watermelon 🍉🍉 & the price is 50 rs per piece");
				case "pap" -> System.out.println("papaya & the price is 70 rs per kg");
				case "str" -> System.out.println("strawberry 🍓🍓 & the price is 300 rs per kg");
				case "guv" -> System.out.println("guava  🍏🍏 & the price is 90 rs per kg");

				default -> System.out.println("entered item is not available ❌");
				}

			}
			default -> System.out.println("entered category is invalid");

			}
			System.out.println("do you wan to proceed click y or n..?");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

	}

}
