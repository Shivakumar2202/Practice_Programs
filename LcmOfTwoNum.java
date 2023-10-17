package com.kodnest;

import java.util.Scanner;

public class LcmOfTwoNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=s.nextInt();
		System.out.print("Enter the second number: ");
		int b=s.nextInt();
		int ans = (a > b) ? a : b;
		while(true) {
			if(ans%a==0&&ans%b==0)
				break;
				ans++;
		}
		System.out.println("LCM of "+a+" and "+b+" is "+ans);
		s.close();
	}

}
