package com.kodnest;

import java.util.Scanner;

public class Circlemethod {
	double circle() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the radius of Circle: ");
		double r=s.nextDouble();
		double circlearea=3.1427*r*r;
		return circlearea;
		
	}

}
