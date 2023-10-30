package com.kodnest.LoopsCC;

import java.util.Scanner;

public class MultiplicationWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! please enter the value of n: ");
		int n = s.nextInt();
		System.out.println("The multiplication table of number is: ");
		int i = 1;
		while (i <= 10) {
			System.out.println(n + " X " + i + " = " + (n * i));
			i++;
		}
		s.close();
	}

}
