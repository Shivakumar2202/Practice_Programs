package com.kodnest.NumberProgramming;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("User please enter the number: ");
		int n=s.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			
			fact=fact*i;	
		}
		System.out.println("The factorial of a given number is: "+fact);
		s.close();
	}

}
