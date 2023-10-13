package com.kodnest.project;

import java.util.Scanner;

public class NumSign {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 1; i < 100; i++) {
			System.out.println("Enter the number: ");
			long n = s.nextLong();
			if (n < 0) {
				System.out.println(n + " is negative");
			} else {
				System.out.println(n + " is positive");
			}
		}
		s.close();
	}

}
