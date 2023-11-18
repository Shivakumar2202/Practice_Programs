package com.kodnest.pattrean;

public class PattrendownTriangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<=5; j++) {
				if(j>=i) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j = 4; j>=1; j--) 
			{
				if(j>=i) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println("");
		}


	}

}
