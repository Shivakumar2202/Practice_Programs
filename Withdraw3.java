package com.kodnest.practice1;

import java.util.Random;
import java.util.Scanner;

public class Withdraw3 {
	void withdraw(int balance) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the money to withdraw: ");
		int withdraw = s.nextInt();
		if (balance >= withdraw) {
			if (withdraw >= 30000) {
				Random random = new Random();
				int randomFourDigitNumber = random.nextInt(9000) + 1000;
				System.out.println("The OTP is: " + randomFourDigitNumber);
				System.out.println("Enter the OTP: ");
				int otp = s.nextInt();
				if (otp == randomFourDigitNumber) {
					balance = balance - withdraw;
					System.out.println("Please take the Money " + withdraw);
					System.out.println("The balance is: " + balance);
					System.out.println("===============================================");
					
				} else {
					System.out.println("Invalid OTP");
				}
			} else {
				balance = balance - withdraw;
				System.out.println("Please take the Money " + withdraw);
				System.out.println("The balance is: " + balance);
				System.out.println("===============================================");
			}
		} else {
			System.out.println("insufficient balance!");
		}
		System.out.println(" ");
	}
}
