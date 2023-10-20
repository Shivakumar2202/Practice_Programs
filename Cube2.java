package com.kodnest.practice1;

import java.util.Scanner;

public class Cube2 {
	int cube()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("User! please Enter the side length of the cube: ");
		int a=s.nextInt();
		//s.close();
		int volume=a*a*a;
		return volume;
	}
}
