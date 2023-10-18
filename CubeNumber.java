package com.kodnest.project;

import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number for cubeing: ");
		int a=s.nextInt();
		System.out.println("The cube of the number is: "+(a*a*a));
		s.close();

	}

}
