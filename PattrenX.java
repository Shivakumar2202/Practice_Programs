package com.kodnest.pattrean;

public class PattrenX {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 11; j++) {
				if ( i==j || i+j==12) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}


	}

}
