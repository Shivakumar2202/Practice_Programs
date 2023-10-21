package com.kodnest.practice1;

import java.util.Scanner;

public class ATMmethods {

	public static void main(String[] args) {
		int balance=100000;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to SBI ATM");
		System.out.println(" ");
		System.out.println("please insert the ATM card");
		System.out.println(" ");
		System.out.println("Enter the pin");
		int pin = s.nextInt();
		System.out.println(" ");

		while (true) {
			System.out.println("===============================================");
			System.out.println("Choose the operation you want to perform:");
			System.out.println(" ");
			System.out.println("choice 1: Withdraw");
			System.out.println("choice 2: Deposit");
			System.out.println("choice 3: Balance");
			System.out.println("choice 4: Exit");
			int choice = s.nextInt();
			System.out.println("-----------------------------------------------");
			switch (choice) {
			case 1:
				Withdraw3 withdraw=new Withdraw3();
				withdraw.withdraw(balance);
				break;
			case 2:
				Deposit3 deposit=new Deposit3();
				deposit.deposit(balance);
				break;
			case 3:
				Balance3 Balance=new Balance3();
				Balance.Balance(balance);
				break;
			case 4:
				System.exit(0);
				s.close();
			}

		}
	}
}
