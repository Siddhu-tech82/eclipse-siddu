package com.logicalstatements;

import java.util.Scanner;

public class CricketInformation {

	public static void main(String[] args) {

		System.out.println("cricketer info ");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a jersey number to get the details");

		int jno = sc.nextInt();

		switch (jno) {

		case 7:
			System.out.println("thala for a reason");
			System.out.println("the one & only the best & cool captain MR.MS DHONI");
			break;
		case 18:
			System.out.println("the king kholi and we can call run machine of the cricket ");
			System.out.println("consistency player and very aggresive cricketer");
			break;

		case 45:
			System.out.println("the hit man");
			System.out.println("a good captain & also a good hitter");
			break;

		default:
			System.out.println("invalid jersey number you entered plz entered the correct jersy number");

		}

	}

}
