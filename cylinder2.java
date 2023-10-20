package com.kodnest.practice1;

import java.util.Scanner;

public class cylinder2 {
	double cylinder()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("User! please enter the base radius of cylinder: ");
		double r=s.nextDouble();
		System.out.println("User! please enter the length of the cylinder: ");
		double l=s.nextDouble();
		//s.close();
		double volume=3.1427*r*r*l;
		return volume;
	}

}
