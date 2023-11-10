package com.kodnest.pattrean;

public class PattrenV {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 11; j++) {
				if (      i==1&&j==1 || i==1 && j== 11
						||i==3&&j==2 || i==3 && j== 10
						||i==5&&j==3 || i==5 && j== 9
						||i==7&&j==4 || i==7 && j== 8
						||i==9&&j==5 || i==9 && j== 7
						||i==11&&j==6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}

	}

}
