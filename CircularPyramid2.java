package com.kodnest.practice1;

import java.util.Scanner;

class CircularPyramid2 {
	double circularpyramid()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("User! please enter the base radius of the circularpyramid: ");
		double R1=s.nextDouble();
		System.out.println("User! please enter the height of the circularpyramid: ");
		double h=s.nextDouble();
		//s.close();
		double area=3.1427*R1*R1;
		double volume=0.3333*area*h;
		return volume;
	}

}
