package com.kodnest;

import java.util.Scanner;

public class Milage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double fual1 = 3.57f;
		System.out.println("Enter the amount of fual: ");
		double r = s.nextFloat();
		double fual2 = (r / 103.44);
		System.out.println("Total fual is: "+fual2);
		double fual = fual1 + fual2;
		if (fual >= 28 && fual <= 35) {
			System.out.println("* * * * *");
		} else if (fual >= 21 && fual <= 28) {
			System.out.println("* * * *");
		} else if (fual >= 14 && fual <= 21) {
			System.out.println("* * *");
		} else if (fual >= 7 && fual <= 14) {
			System.out.println("* *");
		} else {
			System.out.println("*");
		}
		System.out.println("Enter the distance traveled: ");
		double d=s.nextDouble();
		System.out.println("Enter the number of stars: ");
		String n=s.next();
		if (n=="* * * * *") {
			System.out.println("The average milage is: "+(((fual-35)/d)*100));
		} else if (n=="* * * *") {
			System.out.println("The average milage is: "+(((fual-28)/d)*100));
		} else if (n=="* * *") {
			System.out.println("The average milage is: "+(((fual-21)/d)*100));
		} else if (n=="* *") {
			System.out.println("The average milage is: "+(((fual-14)/d)*100));
		} else {
			System.out.println("The average milage is: "+(((fual-7)/d)*100));
		}
		

	}

}
