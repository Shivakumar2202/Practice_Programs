package com.kodnest.pattrean;

public class AlphabetPattren {

	public static void main(String[] args) {
		for(int i=65;i<=68;i++) {
			for(int j=65;j<=i;j++) {
				System.out.print((char)i+" ");
			}System.out.println("");
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print((char)(i+68)+" ");
			}System.out.println("");
		}
		/*for(char i='j';i>'M';i--) {
			for(char j='J';j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}*/

	}

}
