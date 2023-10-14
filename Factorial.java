package com.kodnest.project;

import java.util.Scanner;

class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int j=1;j<100;j++) {
		System.out.println(" ");
		System.out.print("Enter The Number: ");
		int n=s.nextInt();
		long a=1;
		if(n<0) {
			System.out.println("n is a negative value");
		}
		else {
		for(int i=1;i<=n;i++)
		{
			a*=i;
		}
		}
		System.out.println("The Factorial of a number "+n+" is: "+a);
		}
		s.close();
	}

}
