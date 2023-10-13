package com.kodnest.project;

import java.util.Scanner;

class GreaterNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value a: ");
		int a=s.nextInt();
		System.out.println("enter the value b: ");
		int b=s.nextInt();
		if (a>b)
			System.out.println(+a+"is greater");
		else
			System.out.println(+b+"is greater");
		s.close();
		
	}

}
