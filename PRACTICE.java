package com.kodnest.level1;

import java.util.Scanner;

public class PRACTICE {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int n=scan.nextInt();
		System.out.println("Enter the "+n+" number of elements into the array:");
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the element to be searched: ");
		int find=scan.nextInt();
		boolean flag=false;
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i]==find) {
				flag=true;
				break;
			}else {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Element is fount at a position "+(i+1));
		}
		else {
			System.out.println("Element is not found in the array");
		}
		scan.close();
	}

}
