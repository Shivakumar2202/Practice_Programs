package com.kodnest.Array_practice;

import java.util.Scanner;

public class positivetoNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User Enter the size of an array:");
		int size = scan.nextInt();
		int[] a = createArray(size);
		display(a);
		System.out.println();
		replace(a);
	}

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	private static void replace(int[] a) {
		System.out.println("The array replaced with negative elements are: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = -a[i];
		}
		display(a);

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
