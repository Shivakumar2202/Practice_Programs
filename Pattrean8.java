package com.kodnest.pattrean;

import java.util.Scanner;

public class Pattrean8 {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of lines: ");
		int k=s.nextInt();
		for(a=0;a<k;a++)
		{
			for(b=0;b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		


	}

}
