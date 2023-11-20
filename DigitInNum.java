package com.kodnest.NumberProgramming;

import java.util.Scanner;

public class DigitInNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("User please enter the number: ");
		long n = s.nextLong();
		s.close();
		long que = n,count=0;
		while(que>0) {
			long rem=que%10;
			que=que/10;
			count++; 
		}
		/*for (int i = 1; que > 0; i++) 
		{
			long rem = que % 10;
			que = que / 10;
			digit=i;
		}*/
		System.out.println("The number of Digits in a given number is:"+count);
	}

}
