package com.kodnest.project1;

import java.util.Scanner;

class ASCIIValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int n = 1; n <= 100; n++) {
			System.out.print("Enter the character =");
			char c = scan.next().charAt(0);
			System.out.println("The ASCII Value of " + c + " is " + (+c));
			System.out.println();
		}
		scan.close();

	}

}
