package com.kodnest.Array_practice;

import java.util.Scanner;

public class RotationOfArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! please enter the size of an array: ");
		int size = s.nextInt();
		System.out.println("User! please enter the " + size + " number of array elements: ");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int n = a.length;
		System.out.println("Your array before rotation is: ");
		System.out.print("a=[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		System.out.println("User! please enter the number of values to be rotated: ");
		int k = s.nextInt();
		
		RotateRight right = new RotateRight();
		right.rightrotation(a, k, n);
		
		RotateLeft left = new RotateLeft();
		left.leftrotation(a, k, n);
		
		/*System.out.println("Your array after rotation is: ");
		System.out.print("a=[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");*/
		s.close();

	}

}
