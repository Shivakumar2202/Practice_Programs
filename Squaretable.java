package com.kodnest.project;

import java.util.Scanner;

public class Squaretable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range upto which the square table has to be obtained: ");
		int n = s.nextInt();
		System.out.println("the square tables are: ");
		for (int i = 1; i <= n; i++) {
			char c=(char)178;

			System.out.println(i +""+c +"="+(i * i));

		}
		s.close();

	}

}
