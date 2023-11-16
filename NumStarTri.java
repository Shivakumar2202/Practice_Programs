package com.kodnest.pattrean;

public class NumStarTri {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j) {
					System.out.print(j*10);
				}
				else {
					System.out.print((j*10)+"*");
				}
				
			}
			System.out.println("");
		}

	}

}
