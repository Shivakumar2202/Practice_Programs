package com.kodnest.project;

import java.util.Scanner;

public class Cubetable {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the range upto which the cube table has to be obtained: ");
			int n = s.nextInt();
			System.out.println("the square tables are: ");
			for (int i = 1; i <= n; i++) {
				char c=(char)179;

				System.out.println(i +""+c +"="+(i * i*i));

			}
			s.close();

		}

	}
