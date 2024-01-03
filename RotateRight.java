package com.kodnest.Array_practice;

public class RotateRight {
	void rightrotation(int a[], int k, int n) {
		/*for (int i = 0; i < k; i++) {
			int temp = a[n - 1];
			for (int j = n - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0]=temp;
		}*/
		int[] temp=new int[a.length];
		for(int i=0;i<n;i++) {
			temp[(i+k)%n]=a[i];
		}
		System.out.println("Your array after rightrotation is: ");
		System.out.print("a=[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println("]");
	}

}
