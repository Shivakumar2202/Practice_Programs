package com.kodnest.project;

import java.util.Scanner; 

class TYpeCast {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		for(int n=1;n<=100;n++) {System.out.println();
		System.out.print("enter the long value: ");
		long l=scan.nextLong();
		
		byte b=(byte)l;
		System.out.println("type casted value of byte is: "+b);
		short s=(short)l;
		System.out.println("type casted value of short is: "+s);
		int i=(int)l;
		System.out.println("type casted value of int is: "+i);
		float f=l;
		System.out.println("type casted value of float is: "+f);
		double d=l;
		System.out.println("type casted value of double is: "+d);
		char c=(char)l;
		System.out.println("type casted value of char is: "+c);
		}scan.close();
	}
}
