package com.kodnest;

import java.util.Scanner;

public class Ellipsemethod {
	double ellipse() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of minor axis a of Ellipse: ");
		double a=s.nextDouble();
		System.out.println("Enter the length of minor axis b of Ellipse: ");
		double b=s.nextDouble();
		double A=a/2;
		double B=b/2;
		double Ellipse=3.1427*A*B;
		return Ellipse;
		
	}

}
