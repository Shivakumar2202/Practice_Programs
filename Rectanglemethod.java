package com.kodnest;

import java.util.Scanner;

public class Rectanglemethod {
	double rectangle() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the length of the Rectangle: ");
		double l=s.nextDouble();
		System.out.print("Enter the breadth of the Rectangle: ");
		double b=s.nextDouble();
		double rectangle=l*b;
		return rectangle;
		
	}

}
