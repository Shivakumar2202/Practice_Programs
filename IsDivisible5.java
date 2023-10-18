package com.kodnest;

import java.util.Scanner;

public class IsDivisible5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number up to which we have to find the divisiblety of 5: ");
		long a=s.nextLong();
		for(int i=1;i<=a;i++) {
			if(i%5==0) {
				System.out.println("The integer divisible by 5 are: "+i);
			}
		}s.close();

	}

}
