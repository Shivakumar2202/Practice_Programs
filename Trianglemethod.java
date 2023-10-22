package com.kodnest;

import java.util.Scanner;

public class Trianglemethod {
	double triangle() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the base length of the Triangle: ");
		double base=s.nextDouble();
		System.out.print("Enter the height of the Triangle: ");
		double h=s.nextDouble();
		double teiarea=0.5*base*h;
		return teiarea;
		
	}

}
