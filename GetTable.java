package com.kodnest.project;

import java.util.Scanner;

public class GetTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number to get Table of it");
		int num=scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		scan.close();
	}

}
