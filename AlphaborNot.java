package com.kodnest.project;

import java.util.Scanner;

public class AlphaborNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=1;i<100;i++) {
		System.out.print("Enter the character: ");
		char c=s.next().charAt(0);
		int n=(+c);
		System.out.println(n);
		if((n>=65 && n<=90)||(n>=97 && n<=122))
		{
			System.out.println(c+" is an alphabet");
		}
		else 
		{
			System.out.println(c+" is not an alphabet");
		}
		}
		s.close();

	}

}
