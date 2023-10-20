package com.kodnest.practice1;

import java.util.Scanner;

public class VolumeMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("user! Please select the block to find the volume");
			System.out.println("choice 1: Cube");
			System.out.println("choice 2: Cylinder");
			System.out.println("choice 3: Sphere");
			System.out.println("choice 4: circular Pyramid");
			System.out.println("choice 5: EXIT");
			int choice = s.nextInt();
			System.out.println("================================================");
			switch (choice) {
			case 1:
				Cube2 cube = new Cube2();
				int res1 = cube.cube();
				System.out.println("the volume of cube is:  " + res1);
				System.out.println("================================================");
				break;
			case 2:
				cylinder2 cylinder = new cylinder2();
				double res2 = cylinder.cylinder();
				System.out.println("The volumr of cylinder is; " + res2);
				System.out.println("================================================");
				break;
			case 3:
				Sphere2 sphere = new Sphere2();
				double res3 = sphere.sphere();
				System.out.println("The volume of the Sphere is: " + res3);
				System.out.println("================================================");
				break;
			case 4:
				CircularPyramid2 circularpyramid = new CircularPyramid2();
				double res4 = circularpyramid.circularpyramid();
				System.out.println("The volume of the circularpyramid is: " + res4);
				System.out.println("================================================");
				break;
			case 5:
				System.out.println("==================!!--EXIT--!!==================");
				s.close();
				break;
			default:
				System.out.println("!!__INVALID INPUT__!!");
				System.out.println("================================================");
				break;

			}

		}
	}
}
