package com.kodnest.practice1;

import java.util.Scanner;

public class Area1 {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("user! Enter the length of Square: ");
			int side=s.nextInt();
			//square square=new square();
			int area=findarea(side);
			System.out.println("The area of the Square is: "+area);
			s.close();
		}
		 static int findarea(int side) {
			int area=side*side;
			return area;

		}

	}

