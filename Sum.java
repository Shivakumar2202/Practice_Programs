package com.kodnest.project1;

import java.util.Scanner;

class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first variable a=");
		int a = scan.nextInt();
		System.out.print("Enter the second variable b=");
		int b = scan.nextInt();
		System.out.println("The sum is c=" + (a + b));
		scan.close();

	}

}
