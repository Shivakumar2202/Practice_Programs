package com.kodnest;

import java.util.Scanner;

public class Volumes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("user! Please select the block to find the volume");
			System.out.println("choice 1: Cube");
			System.out.println("choice 2: Sphere");
			System.out.println("choice 3: Cylinder");
			System.out.println("choice 4: Triangular Pyramid");
			System.out.println("choice 5: EXIT");
			int choice = s.nextInt();
			System.out.println("----------------------------------------------");
			switch (choice) {
			case 1:
				System.out.println("Enter the side of the cube: ");
				long a = s.nextLong();
				long vol1 = a * a * a;
				System.out.println("The volume of cube is: " + vol1);
				System.out.println("----------------------------------------------");
				break;
			case 2:
				System.out.println("Enter the radius of sphere: ");
				double r = s.nextLong();
				double vol2 = 1.3333 * 3.1427 * r * r * r;
				System.out.println("The volume of the sphere is: " + vol2);
				System.out.println("----------------------------------------------");
				break;
			case 3:
				System.out.println("Enter the Base radius of the cylinder: ");
				double b = s.nextDouble();
				System.out.println("Enter the length of the cylinder: ");
				double l = s.nextDouble();
				double vol3 = 3.1427 * b * b * l;
				System.out.println("The volume of the cylinder is: " + vol3);
				System.out.println("----------------------------------------------");
				break;
			case 4:
				System.out.println("Enter the side of the base triangle: ");
				double c = s.nextDouble();
				System.out.println("Enter the height of the base triangle: ");
				double e = s.nextDouble();
				double area = 0.5 * c * e;
				System.out.println("Enter the height of the Triangular Pyramid: ");
				double H = s.nextDouble();
				double vol4 = 0.3333 * area * H;
				System.out.println("The volume of Triangular Pyramid is: " + vol4);
				System.out.println("----------------------------------------------");
				break;
			case 5:
				System.out.println("Exit");
				System.out.println("----------------------------------------------");
				s.close();

			default:
				System.out.println("!!invalid input!!");
			}

		}

	}
}
