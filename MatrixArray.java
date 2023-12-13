package Level1;

import java.util.Scanner;

public class MatrixArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int m = s.nextInt();
		System.out.println("Enter the number of column: ");
		int n = s.nextInt();
		int[][] a = new int[m][n];
		int sum=0;
		System.out.println("Enter the "+(m*n)+" number of array elements: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("The array elements are: ");
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("  ");
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]%2==1) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.print("The sum of all the array elements are: "+sum);
		s.close();
	}

}
