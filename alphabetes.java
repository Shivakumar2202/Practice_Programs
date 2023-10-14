package com.kodnest.project;

import java.util.Scanner;

public class alphabetes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("please menction that alphabets should type in upper(1) case or lower(0) case: ");
		int a = s.nextInt();
		if (a == 1) {
			for (char c = 'a'; c <= 'z'; ++c) {
				System.out.print(c + " ");
			}
		} else if(a==0) {
			for (char C = 'A'; C <= 'Z'; ++C) {
				System.out.print(C + " ");
			}
		}else {
			System.out.println("!!Invalid Input!!");
		}
		s.close();

	}

}
