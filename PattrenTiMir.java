package com.kodnest.pattrean;

public class PattrenTiMir {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 4; j>=1; j--) {
				if(j<=i) {
				System.out.print("*");
				}
				else {
					System.out.print("_");
				}
			}
			System.out.println("");
		}

	}

}
/*for(int i=1;i<=3;i++){
 * for(int j=3;j>=1;j--){
 * System.out.print(" ");
 * }
 * for(int j=1;j<=1;j++){
 * System.out.print("*");
 * }
 * System.out.println():
 * }
 */ 
 
