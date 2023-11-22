package com.kodnest.NumberProgramming;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User please enter the number: ");
		int n = s.nextInt();
		int que = n;
		int evensum = 0, oddsum = 0;
		while (que > 0) {
			int rem = que % 10;
			que = que / 10;
			if (rem % 2 == 0) {
				evensum = evensum + rem;
			} else {
				oddsum = oddsum + rem;
			}
		}
		System.out.println("The sum of even digits in a given number is: "+evensum);
		System.out.println("The sum of odd digits in a given number is: "+oddsum);
		s.close();

	}

}
