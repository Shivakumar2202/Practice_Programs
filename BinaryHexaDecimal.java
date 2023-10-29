package com.kodnest.practice1;

import java.util.Scanner;

public class BinaryHexaDecimal {
	Scanner s;
	int num;

	void getvalue() {
		System.out.println("Binary to HexaDecimal");
		s = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		num = Integer.parseInt(s.nextLine(), 2);
	}

	void convert() {
		String decimal = Integer.toHexString(num);
		System.out.println("HexaDecimal Value is : " + decimal);

	}


}
