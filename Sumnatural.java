package com.kodnest.project;

import java.util.Scanner;

public class Sumnatural {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number upto which you wanted add: ");
		int n=s.nextInt();
		int num=0;
		for(int i=1;i<=n;i++) {
			num=num+i;
		}
		System.out.println("the sum of numbers is= "+num);
		s.close();

	}

}
