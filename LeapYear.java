package com.kodnest.project;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 100; i++) {
			System.out.println("Enter the year: ");
			int year = scan.nextInt();
			int leap = (year % 4);
			if (leap == 0) {
				System.out.println(year + " is a leap year");
			} else {
				System.out.println(year + " is not a leap year");
			}
		}
		scan.close();

	}

}
