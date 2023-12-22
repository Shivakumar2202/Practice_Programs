package sort1;

import java.util.Scanner;

public class SpiralArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("User! please enter the number of rows: ");
		int n=s.nextInt();
		System.out.println("User! please enter the number of columns: ");
		int m=s.nextInt();
		System.out.println("User! enter the "+(n*m)+" number of elements: ");
		int a[][]=new int[n][m];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("your array is: ");
		for(int i=0;i<a.length;i++) {
			System.out.print("|");
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("|");
		}
		SpiralPrint print=new SpiralPrint();
		print.SpiralPrint(a,n,m);
		
		SpiralPrint2 print2=new SpiralPrint2();
		print2.SpiralPrint2(a,n,m);
		s.close();
	}

}
