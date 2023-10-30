package com.kodnest.LoopsCC;

import java.util.Scanner;

public class MultiplicationFor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("User! please enter the value of n: ");
		int n = s.nextInt();
		System.out.println("The multiplication table of number is: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n+" X "+i+" = "+(n*i));
		}
		s.close();

	}

}
