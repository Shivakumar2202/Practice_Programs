package com.kodnest.Methods.Level1;

import java.util.Scanner;

public class MethodFour {

	public static void main(String[] args) {
		addition();
	}
	static void addition() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num1 & num2= ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a + b;
		System.out.println("The sum is= " + result);
		scan.close();
	}

}
