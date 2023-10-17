package com.kodnest;

import java.util.Scanner;

public class IsAutomorphic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int n=s.nextInt();
		int count=0;
		int square=n*n;
		int temp=n;
		System.out.println("the square of the number: "+square);
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int lastDigit=(int)(square%(Math.pow(10,count)));
		if(n==lastDigit)
			System.out.println(n+" is an automorphic number.");
		else
			System.out.println(n+" is not an automorphic number.");
	s.close();	
	}

}
