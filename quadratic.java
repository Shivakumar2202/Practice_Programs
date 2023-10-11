package com.kodnest.project1;

import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the first co efficient of x=");
		double a = s.nextDouble();
		System.out.print("Enter the second co efficient of x=");
		double b = s.nextDouble();
		System.out.print("Enter the third co efficient of x=");
		double c = s.nextDouble();
		
		System.out.println("The expression is " + a + " x^2+ " + b + " x+ " + c + " =0");
		
		double ans1 = 0, ans2=0, res=0;
		double ex = ((b * b) - 4 * a * c);
		ans1=Math.sqrt(ex);
		ans2 = ans1-b;
		res = ans1 / (2 * a);
		System.out.println(ans1);
		
		//double ans2;
		//ans2 = Math.sqrt((b * b) - (4 * a * c));
		//ans2 = -b - ans2;
		//ans2 = ans2 / (2 * a);
		 //System.out.println("The roots are X1 "+ans1+" X2 "+ans2);
		s.close();
	}
}
