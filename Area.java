package com.kodnest.practice1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("user! Enter the length of Square: ");
		int side=s.nextInt();
		square square=new square();
		int area=square.findarea(side);
		System.out.println("The area of the Square is: "+area);
		s.close();
	}
	

}
