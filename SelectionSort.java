package sort1;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("user! please enter the size of an array: ");
		int size = s.nextInt();
		System.out.println("User! please enter the " + size + " number of elements: ");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Your array before sorting is: ");
		System.out.print("a=[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		
		SolveSelectionSort Sort = new SolveSelectionSort();
		Sort.SolveSelectionSort(a);
		System.out.println("your array after sorting is: ");
		System.out.print("a=[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		s.close();

	}

}
