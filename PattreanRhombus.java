package com.kodnest.pattrean;

public class PattreanRhombus {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= 4; j++) {
				if (j <= (i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= (i+1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 3; j >= 1; j--) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println("");

		}
	}
}
/*for (int i = 1; i <= 5; i++) 
 * {
 * for (int j = 1; j <= i; j++)
 * {
 * System.out.print("*");
 * }
 * for(int j=2;j<=i;j++)
 * {
 * System.out.print("*");
 * }
 * System.out.println();
 * for(int i=1;i<=4;i++)
 * {
 * for(int j=4;j>=i;j--)
 * {
 * System.out.print("*");
 */