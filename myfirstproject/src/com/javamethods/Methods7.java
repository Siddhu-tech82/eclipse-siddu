package com.javamethods;

//with argument + with return type
import java.util.Scanner;

//area of triangle = 0.5 * b* h
//area of rectangle = len * breadth
//area of square = side * side
//area of circle = pI * r *r
public class Methods7 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base of triangle : ");
		double base = sc.nextDouble();
		System.out.println("enter the height of triangle");
		float height = sc.nextFloat();

		double artri = findAreaOfTriangle(base, height);
		System.out.println("area of triangle is :" + artri);

		System.out.println("**********************************************");

		System.out.println("enter the length of rectangle : ");
		double length = sc.nextDouble();
		System.out.println("enter the height of rectangle");
		float breadth = sc.nextFloat();

		double arrect = findAreaOfRectangle(length, breadth);
		System.out.println("area of rectangle is :" + arrect);

		System.out.println("**********************************************");

		System.out.println("enter the side of square : ");
		double side = sc.nextDouble();
		System.out.println("enter the side of square : ");
		float side1 = sc.nextFloat();

		double arsd = findAreaOfSquare(side, side1);
		System.out.println("area of square is  : " + arsd);

		System.out.println("**********************************************");

		System.out.println("enter the raduis of circle : ");
		double raduis = sc.nextDouble();
		double arcir = findAreaOfCircle(Math.PI * raduis * raduis);
		System.out.printf("Area of the circle: %.2f", arcir);
	}

	static double findAreaOfTriangle(double b, double h) {
		double artri = 0.5 * b * h;
		return artri;
	}

	static double findAreaOfRectangle(double l, double b) {
		double arrect = l * b;
		return arrect;
	}

	static double findAreaOfSquare(double s, double s1) {
		double arsd = s * s;
		return arsd;
	}

	static double findAreaOfCircle(double r) {
		double arcir = Math.PI * r * r;
		return arcir;

	}

}
