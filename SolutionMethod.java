package com.kodnest.Methods.Level1;

import java.util.Scanner;

public class SolutionMethod {

	public static void main(String[] args) {
		square();

	}

	static void square() {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 100; i++) {
			System.out.print("user! please enter the number=");
			int a = scan.nextInt();
			System.out.println("the square of the number is: " + (a * a));
		}
		scan.close();
	}
}
