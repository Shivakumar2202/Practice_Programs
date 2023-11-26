package com.kodnest.pattrean;

public class Assesment {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=6;j++) {
			if(       j==1
					||i==3&&j==3
					||i==4&&j==3
					||i==5&&j==3
					||i==5&&j==5) {
				System.out.print("*");
			}
			else if(j<=i&&j%2==0) {
				System.out.print("#");
			}
			else if(j==(i+1) ) {
				System.out.print("?");
			}
		}
		System.out.println();
	}
}
}
