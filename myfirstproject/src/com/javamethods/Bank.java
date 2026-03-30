package com.javamethods;

public class Bank {

	static int currentBalance = 1000;

	public static void greetCustomer() {

		System.out.println("hello welcome to the banking application");

	}

	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("amount is deposited successfully");

	}

	public void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("amount is withdrawn successfully");
	}

	public int getCurrentBalance() {
		return currentBalance;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Bank bk = new Bank();
		greetCustomer();
		System.out.println("current balance is :" + bk.getCurrentBalance());
		bk.deposit(1000);
		System.out.println("current balance is :" + bk.getCurrentBalance());

		bk.withdrawal(1500);
		bk.getCurrentBalance();

	}

}
