package com.kodnest.pattrean;

public class Pattrean6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			if (i == 2 || i == 3) {
				for (int j = 1; j <= 4; j++) {
					if (j == 2 || j == 3) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				}
			} else {
				for (int j = 1; j <= 4; j++) {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}
