package com.kodnest.pattrean;

public class PattrenK {

	public static void main(String[] args) {
		for (int k = 1; k <= 11; k++) {
			for (int l = 1; l <= 11; l++) {
				if (l == 1 || (k + l) == 7 || (k - l) == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		/*System.out.println("   ");
		System.out.println("-------------------------------------------");
		System.out.println("  ");*/

	}

}
