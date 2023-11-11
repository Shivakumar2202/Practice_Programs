package com.kodnest.pattrean;

public class PattrenY {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 11; j++) {
				if (i == j && i <= 6 || i + j == 12 && i <= 6 || j == 6 && i >= 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}

	}

}
