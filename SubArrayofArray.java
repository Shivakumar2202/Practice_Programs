package com.kodnest.Array_practice;

import java.util.Scanner;

public class SubArrayofArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User Enter the size of an array:");
		int size = scan.nextInt();
		int[] a = createArray(size);
		display(a);
		System.out.println();
		// FindSmallest(a);
		// FindLargest(a);
		SubArray(a);
		scan.close();

	}

	private static void SubArray(int[] a) {
		System.out.println("SubArrays of An Array are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
			}
		}

	}

	/*
	 * private static void FindLargest(int[] a) { int largest = a[a.length - 1]; for
	 * (int i = a.length - 1; i >= 0; i--) { if (a[i] > largest) { largest = a[i]; }
	 * } System.out.println("The largest element of an Array is: " + largest);
	 * 
	 * }
	 */

	/*
	 * private static void FindSmallest(int[] a) { int small = a[0]; for (int i = 0;
	 * i < a.length; i++) { if (a[i] <= small) { small = a[i]; } }
	 * System.out.println("The smallest element in an Array is: " + small);
	 * 
	 * }
	 */

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int[] createArray(int n) {
		int a[] = new int[n];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of an array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("The elements of an array are: ");
		return a;
	}

}
