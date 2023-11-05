package com.kodnest.pattrean;

public class PattrenG {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) 
		{
			for (int j = 1; j <= 8; j++) {
				if (   i == 1 && j != 1 && j != 8 
					|| i == 11 && j != 1 && j != 8 
					|| j == 1 && i != 1 && i != 11
					|| j == 8 && i != 1 && i != 11 && i<=2
					|| j == 8 && i != 1 && i != 11 && i>=7
					|| i == 6 && j != 2 && j != 3 && j!=8) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
		
			System.out.println("  ");
		}

	}

}
