package com.kodnest.NumberProgramming;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int m, n, sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		m = s.nextInt();
		int num=m;
		while (num > 0) {
			n = num % 10;
			sum = sum * 10 + n;
			num = num / 10;
		}
		System.out.println("  ");
		System.out.println("Reverse of a Number is " + sum);
		if(m==sum) {
			System.out.println(" ");
			System.out.println(":..The number is palindrome..:");
		}
		else {
			System.out.println(" ");
			System.out.println(":..The number is not a palindrome..:");
		}
		s.close();

	}

}
