package com.javaconstructors;

public class Student {

	String sid;
	String sname;
	int sage;

	Student() {
		System.out.println("student no-arg constructor called");
	}

	// this is we called as parameterized constructor
	Student(String sid, String sname, int sage) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		System.out.println("parametrized constructor called");

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Student st = new Student("jfs-vc-001", "siddhu", 22);
		st.show();

		System.out.println("*******************************");

		Student s2 = new Student("jfs-vc-002", "bharath", 24);
		s2.show();

		System.out.println("main method started");

	}

	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);

		

	}
	
	

}

