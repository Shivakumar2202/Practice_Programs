package com.kodnest.pattrean;

public class PattrenL {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 11 || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}

	}

}
