package com.kodnest.LoopsCC;

import java.util.Scanner;

public class WhileNatural {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! please enter the value of n: ");
		int n = s.nextInt();
		System.out.println("The even number up to n is: ");
		int i = 1; 
		while(i <= n) {
			System.out.println(i);
			i++;
		}
		s.close();

	}

}
