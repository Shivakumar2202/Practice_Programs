package com.kodnest.ControlConstructs;

import java.util.Scanner;

public class EligbilityVote {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 1; i < 100; i++) {
		System.out.println("User! please enter the age: ");
		int age = s.nextInt();
			if (age >= 18) {
				System.out.println("Eligible for vote");
			}
			if (age < 18) {
				System.out.println("Not Eligible for vote");
			}
		}s.close();

	}

}
