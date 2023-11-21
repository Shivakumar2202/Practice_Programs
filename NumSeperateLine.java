package com.kodnest.NumberProgramming;

import java.util.Scanner;

public class NumSeperateLine {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("User please enter the number: ");
		int n=s.nextInt();
		int que=n;
		while(que>0) {
			int rem=que%10;
			que=que/10;
			System.out.println(rem); 
		}
		/*for(int i=1;que>0;i++) {
			int rem=que%10;
			que=que/10;
			System.out.println(rem);
		}*/
		s.close();

	}

}
