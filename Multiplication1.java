package com.kodnest.practice1;

import java.util.Scanner;

class Multiplication1 {
	int Multiplication() {

		Scanner s = new Scanner(System.in);
		System.out.print("user! Enter the number-1: ");
		int a = s.nextInt();
		System.out.print("user! Enter the number-2: ");
		int b = s.nextInt();
		int multipli=a*b;
		return multipli;

	}
}
