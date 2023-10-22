package com.kodnest;

import java.util.Scanner;

public class Trapeziummethod {
	double trapezium() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the battom side length of the trapezium: ");
		double a=s.nextDouble();
		System.out.println("Enter the top side length of the trapezium:");
		double b=s.nextDouble();
		System.out.println("Enter the height of the trapezium:");
		double h=s.nextDouble();
		double trapezium=0.5*(a+b)*h;
		return trapezium;
	}

}
