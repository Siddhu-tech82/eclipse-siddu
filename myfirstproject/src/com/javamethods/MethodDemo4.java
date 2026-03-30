package com.javamethods;

public class MethodDemo4 {

	public static void main(String[] args) {

		System.out.println("main method started");
		System.out.println("student infromation");

		MethodDemo4 mt = new MethodDemo4();
		System.out.println("student id     :" + mt.getStudentId());
		System.out.println("student age    :" + mt.getStudentAge());
		System.out.println("student height :" + mt.getStudentHeight());
		System.out.println("student rank   :" + mt.getStudentRank());
		System.out.println("student  weight  :" + mt.getStudentWeight());
		System.out.println("student  gender  :" + mt.getStudentGender());
		System.out.println("student  isstudent passed  :" + mt.isStudentPassed());
		System.out.println("student student name   :" + mt.getStudentName());

	}

	byte getStudentId() {
		return 101;

	}

	short getStudentAge() {
		short age = 23;
		return age;
	}

	int getStudentRank() {
		int rank = 2;
		return rank;

	}

	float getStudentHeight() {
		float height = 5.9f;
		return height;
	}

	double getStudentWeight() {
		double weight = 64.4;
		return weight;
	}

	char getStudentGender() {
		char gen = 'm';
		return gen;
	}

	boolean isStudentPassed() {
		boolean status = true;
		return status;

	}

	String getStudentName() {
		String name = "siddhu";
		return name;
	}

}
