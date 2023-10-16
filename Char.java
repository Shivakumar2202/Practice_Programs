package com.kodnest.project;

public class Char {

	public static void main(String[] args) {
		for (int n = 100; n <= 200; n++) {
			System.out.println();
			System.out.print("enter the long value: ");
			long l = n;
			char c = (char) l;
			System.out.println("type casted value of char is: " + c);

		}

	}
}
