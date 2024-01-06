package com.kodnest.level1;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int n = scan.nextInt();
		System.out.println("Enter the " + n + " number of elements into the array:");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the element to be searched: ");
		int ele = scan.nextInt();
		int first = 0;
		int last = a.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (a[mid] < ele) {
				first = mid + 1;
			} else if (a[mid] == ele) {
				System.out.println("Element is found at a position " + (mid+1));
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element not found ");
		}
		scan.close();
	}

}
