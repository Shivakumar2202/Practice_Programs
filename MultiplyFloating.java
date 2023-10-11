package com.kodnest.project1;

import java.util.Scanner;

class MultiplyFloating {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first variable a=");
		float a = scan.nextFloat();
		System.out.print("Enter the second variable b=");
		float b = scan.nextFloat();
		System.out.println("The sum is c=" + (a * b));
		scan.close();

	}

}
