package com.kodnest.project1;

import java.util.Scanner;

class Vowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Alphabet=");
		char c = scan.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U')
			System.out.println(c + " is a vowel character");
		else
			System.out.println(c + " is a consonant");
		scan.close();
	}

}
