package com.kodnest.NumberProgramming;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("User please enter the number: ");
		int n=s.nextInt();
		int que=n;
		int sum=0;
		while(que>0) {
			int rem=que%10;
			que=que/10;
			sum=rem+sum; 
		}
		System.out.println("The sum of digits in given number is: "+sum);
		s.close();

	}

}
