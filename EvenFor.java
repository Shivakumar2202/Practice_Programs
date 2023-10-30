package com.kodnest.LoopsCC;

import java.util.Scanner;

public class EvenFor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! please enter the value of n: ");
		int n = s.nextInt();
		System.out.println("The even number up to n is: ");
		for (int i = 2; i <= n; i = i + 2) {
			System.out.println(i);
		}
		s.close();

	}

}
