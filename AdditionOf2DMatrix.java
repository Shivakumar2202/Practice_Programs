package Level1;

import java.util.Scanner;

public class AdditionOf2DMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a=new int[2][2];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("The array elements are: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
