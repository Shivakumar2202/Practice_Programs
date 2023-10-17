package com.kodnest;

import java.util.Scanner;

public class Calculater {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 100; i++) {
			System.out.println("Enter the first number: ");
			double a = s.nextDouble();
			System.out.println("Enter the second number: ");
			double b = s.nextDouble();
			System.out.println("Enter the operator: ");
			char c = s.next().charAt(0);
			switch (c) {
			case '+':
				System.out.println("The answer is " + a + "+" + b + "=" + (a + b));
				System.out.println("");
				break;
			case '-':
				System.out.println("The answer is " + a + "-" + b + "=" + (a - b));
				System.out.println("");
				break;
			case '*':
				System.out.println("The answer is " + a + "x" + b + "=" + (a * b));
				System.out.println(" ");
				break;
			case '/':
				System.out.println("The answer is " + a + "/" + b + "=" + (a / b));
				System.out.println("");
				break;
			case '%':
				System.out.println("The answer is " + a + "%" + b + "=" + (a % b));
				System.out.println("");
				break;
				default:
					System.out.println(c+" !invalid input! ");
			}
		}
		s.close();
	}

}
