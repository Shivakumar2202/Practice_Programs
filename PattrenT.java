
package com.kodnest.pattrean;

public class PattrenT {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 11; j++) {
				if (i == 1 || j == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		/*System.out.println("  ");
		System.out.println("----------------------------------------");
		System.out.println("  ");
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
		System.out.println("   ");
		System.out.println("-------------------------------------------");
		System.out.println("  ");
		for (int m = 1; m <= 11; m++) {
			for (int n = 1; n <= 11; n++) {
				if (n == 1 || n == 11 || (n + m) == 12 && m >= 6 || n == m && m >= 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println("  ");
		}*/

	}

}
