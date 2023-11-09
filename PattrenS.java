package com.kodnest.pattrean;

public class PattrenS {

	public static void main(String[] args) {
		for (int i = 1; i <=11; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j == 1 && i !=1 && i !=7 && i !=8 && i !=9 && i !=6 && i !=11|| i == 1 && j != 6 && j !=1  
						   || i == 6 && j != 6 && j != 1 
						   || i == 11&& j != 6 && j != 1
						   || j == 6 && i !=6 && i != 1 && i != 6 && i != 11 && i !=3 && i !=4 && i !=5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}

	}

}
