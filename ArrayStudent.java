package Level1;

import java.util.Scanner;

public class ArrayStudent {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User! please enter the size of an array: ");
		int size=scan.nextInt();
		int[] a=new int[size];
		System.out.println("User! plase enter the "+size+" elements");
		for(int i=0;i<=size-1;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("The elements are: ");
		for(int i=0;i<=size-1;i++) {
			System.out.println(a[i]);
		}
		scan.close();
	}

}
