package level1;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User! please enter the number of elements: ");
		int n=scan.nextInt();
		System.out.println("User! please enter the "+n+" number of elements:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("User! enter the element to be searched: ");
		int ele=scan.nextInt();
		int m=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				flag=true;
				m=i+1;
				break;
			}
			else {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("element is present at position "+m);
		}
		else {
			System.out.println("!...Element is not found...!");
		}
		scan.close();

	}

}
