package com.kodnest.project;

import java.util.Scanner;

class Airthmatic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value A: ");
		float a=s.nextFloat();
		System.out.print("Enter the value B: ");
		float b=s.nextFloat();
		System.out.print("Enter the value C: ");
		float c=s.nextFloat();
		System.out.print("Enter the value D: ");
		float d=s.nextFloat();
		System.out.println("Addition is: "+(a+b+c+d));
		System.out.println("Difference is: "+(a-b-c-d));
		System.out.println("Product is: "+(a*b*c*d));
		System.out.println("Quotient is: "+(a/b)/(c/d));
		System.out.println("Remainder is: "+(a%b)%(c%d));
		s.close();
		

	}

}
