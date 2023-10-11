package com.kodnest.project1;

import java.util.Scanner;

class sqrt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=1;i<100;i++) {
		System.out.println("enter the number=");
		double a=s.nextDouble();
		System.out.println(Math.sqrt(a));
		}
		s.close();
	}

}
