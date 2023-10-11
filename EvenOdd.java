package com.kodnest.project1;

import java.util.Scanner;

class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number=");
		int a = scan.nextInt();
		if ((a % 2) == 0)
			System.out.println(+a + " is even");
		else
			System.out.println(+a + " is odd");
		scan.close();
	}

}
