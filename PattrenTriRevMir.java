package com.kodnest.pattrean;

public class PattrenTriRevMir {
	public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 4; i++) 
		 * { 
		 * for (int j = 1; j<=4; j++) 
		 * { 
		 * if(j>=i) 
		 * {
		 * System.out.print("* "); 
		 * } 
		 * else 
		 * { 
		 * System.out.print("  "); 
		 * } 
		 * }
		 * System.out.println(""); 
		 * }
		 */
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 3; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
