package com.kodnest;

import java.util.Scanner;

public class Areamethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("user! Please select the shape to find the area");
			System.out.println("choice 1: Square");
			System.out.println("choice 2: Rectangle");
			System.out.println("choice 3: Circle");
			System.out.println("choice 4: Triangle");
			System.out.println("choice 5: Trapezium");
			System.out.println("choice 6: Ellipse");
			System.out.println("choice 7: EXIT");
			int choice = s.nextInt();
			System.out.println("----------------------------------------------");
			switch (choice) {
			case 1:
				Squaremethod square=new Squaremethod();
				double res1=square.square();
				System.out.println("The area of the Square is: "+res1);
				System.out.println("----------------------------------------------");
				break;
			case 2:
				Rectanglemethod rectangle=new Rectanglemethod();
				double res2=rectangle.rectangle();
				System.out.println("The area of Rectangle is: "+res2);
				System.out.println("----------------------------------------------");
				break;
			case 3:
				Circlemethod circle=new Circlemethod();
				double res3=circle.circle();
				System.out.println("The area of Circle is: "+res3);
				System.out.println("----------------------------------------------");
				break;
			case 4:
				Trianglemethod triangle=new Trianglemethod();
				double res4=triangle.triangle();
				System.out.println("The area of Triangle is: "+res4);
				System.out.println("----------------------------------------------");
				break;
			case 5:
				Trapeziummethod trapezium=new Trapeziummethod();
				double res5=trapezium.trapezium();
				System.out.println("The area of trapezium is: "+res5);
				System.out.println("----------------------------------------------");
				break;
			case 6:
				Ellipsemethod ellipse=new Ellipsemethod();
				double res6=ellipse.ellipse();
				System.out.println("The area of ellipse is: "+res6);
				System.out.println("----------------------------------------------");
				break;
			case 7:
				System.out.println("------------------------!!EXIT!!------------------");
				s.close();
				break;
				default:
					System.out.println("----------------!!INVALID INPUT!!-------------");
					break;
			}

		}
	}
}
