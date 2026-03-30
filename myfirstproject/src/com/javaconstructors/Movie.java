package com.javaconstructors;

public class Movie {
	String hero;
	String heroine;
	String director;
	double budget;
	String moviename;
	String producer;

	Movie() {
		System.out.println("no-arg constructor called");
	}

	Movie(String producer, String director) {
		System.out.println("parameterized constructor called");
		System.out.println("-------------------------------------");
		this.producer = producer;
		this.director = director;

	}

	Movie(Movie m, String hero, double budget) {
		this(m.producer,m.director);
		System.out.println("parameterized two constructor called");
		this.hero = hero;
		this.budget = budget;
		this.producer = m.producer;
		this.director = m.director;

	}

	Movie(Movie m, String heroine, String moviename) {
		System.out.println("parameterized three constructor called");
		this.budget = m.budget;
		this.director = m.director;
		this.producer = m.producer;
		this.hero = m.hero;
		this.heroine = heroine;
		this.moviename = moviename;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Movie m1 = new Movie();

		Movie m2 = new Movie("D V V ", "RAJAMOULI");
		m2.showDetails();

		Movie m3 = new Movie(m2, "MAHESH BABU", 5000);
		m3.showDetails();

		Movie m4 = new Movie(m3, "priyanka chopra", "varansi");
		m4.showDetails();

		System.out.println("main method ended");

	}

	void showDetails() {
		System.out.println("name of the hero       : " + hero);
		System.out.println("name of the heroine    : " + heroine);
		System.out.println("name of the moviename  : " + moviename);
		System.out.println("name of the director   : " + director);
		System.out.println("name of the producer   : " + producer);
		System.out.println("budget of the movie    : " + budget);
		System.out.println("******************************************");

	}

}
