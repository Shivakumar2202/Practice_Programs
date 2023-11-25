/*
 * Write a java program to declare and initialize two float values and find the difference of it 
 */

package com.kodnest.practice1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("value A: ");
		float a=s.nextFloat();
		System.out.println("value B: ");
		float b=s.nextFloat();
		if(a>b) {
		System.out.println("the difference is: "+(a-b));
		}
		else
		{
			System.out.println("the difference is: "+(b-a));	
		}
		s.close();
	}

}
