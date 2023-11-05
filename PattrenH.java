package com.kodnest.pattrean;

public class PattrenH {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int k = 1; k <= 8; k++) {
				if (k == 1 || k == 8 || i == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}

	}

}
