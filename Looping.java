package com.kodnest.LoopsCC;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! please enter the value of n: ");
		int n = s.nextInt();
		s.close();
		System.out.println("The natural  number up to n is: ");
		for (int i = 1; i <= n; i++) {
			if (i == 4) {
				continue;
			} else {
				System.out.println(i);
			}
		}

	}

}
