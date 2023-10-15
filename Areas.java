package com.kodnest.project;

import java.util.Scanner;

class Areas {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("user! Please select the shape to find the area");
		System.out.println("choice 1: Square");
		System.out.println("choice 2: Rectangle");
		System.out.println("choice 3: Triangle");
		System.out.println("choice 4: Circle");
		System.out.println("choice 5: EXIT");
		int choice=s.nextInt();
		System.out.println("----------------------------------------------");
		switch(choice) {
		case 1:
			System.out.print("Enter the length of Square: ");
			double a=s.nextDouble();
			double sqarea=a*a;
			System.out.println("The area of the Square is: "+sqarea);
			System.out.println("----------------------------------------------");
			break;
		case 2:
			System.out.print("Enter the length of the Rectangle: ");
			double l=s.nextDouble();
			System.out.print("Enter the breadth of the Rectangle: ");
			double b=s.nextDouble();
			double recarea=l*b;
			System.out.println("The area of Rectangle is: "+recarea);
			System.out.println("----------------------------------------------");
			break;
		case 3:
			System.out.print("Enter the base length of the Triangle: ");
			double base=s.nextDouble();
			System.out.print("Enter the height of the Triangle: ");
			double h=s.nextDouble();
			double teiarea=0.5*base*h;
			System.out.println("The area of Triangle is: "+teiarea);
			System.out.println("----------------------------------------------");
			break;
		case 4:
			System.out.print("Enter the radius of Circle: ");
			double r=s.nextDouble();
			double circlearea=3.1427*r*r;
			System.out.println("The area of Circle is: "+circlearea);
			System.out.println("----------------------------------------------");
			break;
		case 5:
			System.out.println("---------------------EXIT---------------------");
			s.close();
		}
		}
		

	}

}
