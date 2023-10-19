package com.kodnest.practice1;

import java.util.Scanner;

class Substraction1 {
	int Substraction()
	{
		Scanner s =new Scanner(System.in);
		System.out.print("user! Enter the number-1: ");
		int a=s.nextInt();
		System.out.print("user! Enter the number-2: ");
		int b=s.nextInt();
		int sub=a-b;
		return sub;
	}

}
