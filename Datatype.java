package com.kodnest.project1;

import java.util.Scanner;

public class Datatype {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter the Byte value:");
	byte b=scan.nextByte();
	System.out.println("the Byte value is:"+b);
	
	System.out.println("please enter the short value:");
	short s=scan.nextShort();
	System.out.println("the short value is:"+s);
	
	System.out.println("please enter the int value:");
	int i=scan.nextInt();
	System.out.println("the int value is:"+i);
	
	System.out.println("please enter the long value:");
	long l=scan.nextLong();
	System.out.println("the long value is:"+l);
	
	System.out.println("please enter the char value:");
	char c=scan.next().charAt(0);
	System.out.println("the char value is:"+c);
	
	scan.close();

	}

}
