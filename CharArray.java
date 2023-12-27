package com.kodnest.Array_practice;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=scan.nextInt();
		
		char[] ch=new char[size];
		
		System.out.println("Enter the char array values: ");
		for(int i=0;i<ch.length;i++) {
			ch[i]=scan.next().charAt(0);
		}
		
		System.out.println("Your array is: ");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println("");
		System.out.println("Your in reverse order is: ");
		char[] temp=new char[ch.length];
		for(int i=ch.length-1;i>=0;i--) {
			temp[i]=ch[i];
			System.out.print(temp[i]+" ");
		}
	}

}
