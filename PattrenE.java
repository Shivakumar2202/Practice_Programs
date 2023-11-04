package com.kodnest.pattrean;

public class PattrenE {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j == 1 
						|| i == 1  
						|| i == 6  
						|| i == 11 ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");

		}
	}

}
