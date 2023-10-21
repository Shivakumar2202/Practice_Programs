package com.kodnest.practice1;

import java.util.Scanner;

public class Deposit3 {
	void deposit(int balance) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the money to deposit");
		int d = s.nextInt();
		balance = balance + d;
		System.out.println("Your Money " + d + " has been successfully depsited");
		System.out.println("The balance is: " + balance);
		System.out.println("===============================================");
	}

}
