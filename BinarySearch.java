package level1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("User! please enter the array size: ");
		int n=s.nextInt();
		System.out.println("User! please enter the "+n+" number of elements: ");
		int a[]=new int[n];
		int first=0;
		int last=a.length-1;
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("User! please enter the element to be searched: ");
		int ele=s.nextInt();
		Searchpart Search=new Searchpart();
		Search.search(a, ele, first, last);
		s.close();
		
	}

}
