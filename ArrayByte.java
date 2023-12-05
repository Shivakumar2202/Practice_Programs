package Level1;

import java.util.Scanner;

public class ArrayByte {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User! please enter the size of an array: ");
		int size=scan.nextInt();
		byte[] a=new byte[size];
		System.out.println("User! plase enter the "+size+" elements");
		for(int i=0;i<=size-1;i++) {
			a[i]=scan.nextByte();
		}
		System.out.println("The elements are: ");
		for(int i=0;i<=size-1;i++) {
			System.out.println(a[i]);
		}
		scan.close();

	}

}
