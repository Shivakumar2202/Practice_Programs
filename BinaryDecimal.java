package com.kodnest.practice1;

import java.util.Scanner;

public class BinaryDecimal {
	Scanner s;
	int num;

	void getvalue() {
		System.out.println("Binary to Decimal");
		s = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		num = Integer.parseInt(s.nextLine(), 2);
	}

	void convert() {
		String decimal = Integer.toString(num);
		System.out.println("Decimal Value is : " + decimal);

	}

}
