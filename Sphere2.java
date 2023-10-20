package com.kodnest.practice1;

import java.util.Scanner;

public class Sphere2 {
	double sphere()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("User! please Enter the radius of sphere: ");
		double R=s.nextDouble();
		//s.close();
		double volume=1.3333 * 3.1427 * R*R*R;
		return volume;
		
	}

}
