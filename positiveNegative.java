/*
 * WAJP to check the given number is positive or negative or zero using if-else statement.
 */

package com.kodnest.ControlConstructs;

import java.util.Scanner;

public class positiveNegative {

	public static void main(String args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User please enter the number: ");
		int num = s.nextInt();
		if (num == 0) {
			System.out.println("The given number is zero.");
		}
		else if (num > 0) {
			System.out.println("The given number is positive.");
		}
		else {
			System.out.println("The given number is negative.");
		}
		s.close();
	}

}
