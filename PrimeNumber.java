package com.kodnest.NumberProgramming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = s.nextInt();
		int rem, count = 0;
		for (int i = 1; i <= n; i++) 
		{
			rem = n % i;
			if (rem == 0) 
			{
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prine number");
		}

	}

}
