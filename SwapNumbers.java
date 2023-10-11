package com.kodnest.project1;

import java.util.Scanner;

class SwapNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first element A=");
		int a = scan.nextInt();
		System.out.print("Enter the second element B=");
		int b = scan.nextInt();
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swaping");
		System.out.println("A=" + a + "  B=" + b);
		scan.close();
	}

}
