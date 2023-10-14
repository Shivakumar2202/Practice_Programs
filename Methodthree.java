package com.kodnest.Methods.Level1;

import java.util.Scanner;

public class Methodthree {

	public static void main(String[] args) {
		int res=addition();
		System.out.println("The sum is= "+res);
	}
	static int addition()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num1 & num2= ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int result=a+b;
		scan.close();
		return result;
	}

}
