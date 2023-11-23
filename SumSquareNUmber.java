package com.kodnest.NumberProgramming;

import java.util.Scanner;

public class SumSquareNUmber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range upto which the square table has to be obtained: ");
		int n = s.nextInt();
		System.out.println("the square tables are: ");
		int sum=0;
		for (int i = 1; i <= n; i++) {
			char c=(char)178;
			int squ=i*i;
			System.out.println(i +""+c +"="+squ);
			sum=squ+sum;
		}
		System.out.println("The sum of a suqare numbers is: "+sum);
		s.close();

	}

}
