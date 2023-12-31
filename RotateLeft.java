package com.kodnest.Array_practice;

public class RotateLeft {
	void leftrotation(int a[], int k, int n) {
	int[] temp=new int[a.length];
	for(int i=0;i<n;i++) {
		temp[(i+k+1)%n]=a[i];
	}
	System.out.println("Your array after leftrotation is: ");
	System.out.print("a=[ ");
	for (int i = 0; i < n; i++) {
		System.out.print(temp[i] + " ");
	}
	System.out.println("]");
}

}
