package com.kodnest.Array_practice;

import java.util.Scanner;

public class ArrayPractice2c4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User Enter the size of an array:");
		int size = scan.nextInt();
		int[] a = createArray(size);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("Array elements in reverse order is: ");
		displayreverse(a);
		scan.close();
	}

	private static void displayreverse(int[] a) {
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
		
	}

	public static int[] createArray(int n) {
		int a[] = new int[n];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of an array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("The elements of an array are: ");
		return a;
	}
}
