package Level1;

import java.util.Scanner;

public class Sum2Arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows of array: ");
		int m = s.nextInt();
		System.out.println("Enter the number of column of array: ");
		int n = s.nextInt();
		//
		System.out.println("Enter the "+(m*n)+" number of first array elements");
		int[][] a = new int[m][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		//
		System.out.println("Enter the "+(m*n)+" number of second array elements");
		int[][] b=new int[m][n];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = s.nextInt();
			}
		}
		//
		System.out.println("The first array elements are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		//
		System.out.println("The Second array elements are: ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("The sum of two array elements are: ");
		int[][] sum=new int[m][n];
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum[i].length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println("");
		}
		s.close();

	}

}
