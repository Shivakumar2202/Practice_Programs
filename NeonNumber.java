package com.kodnest;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		int square=num*num;
		System.out.println("the square is: "+square);
		String numberstring = String.valueOf(square);
		int res=0;
		for(int i=0;i<numberstring.length();i++) {
			char digitchar=numberstring.charAt(i);
			int digit=Character.getNumericValue(digitchar);
			res=res+digit;
		}
		System.out.println(res);
		if(res==num) {
			System.out.println(num+" is a neon number");
		}
		else {
			System.out.println(num+" is not a neon number");
		}
		s.close();

	}

}
