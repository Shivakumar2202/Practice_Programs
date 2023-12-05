package Level1;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! enter the number of school: ");
		int m = scan.nextInt();
		System.out.println("User! enter the number of Class: ");
		int n = scan.nextInt();
		System.out.println("User! enter the number of Students: ");
		int p = scan.nextInt();
		int[][][] a = new int[m][n][p];
		System.out.println("User plrase enter the " + (m * n * p) + " Students marks: ");
		for (int k = 0; k < a.length; k++) {
			for (int j = 0; j < a[k].length; j++) {
				for (int i = 0; i < a[k][j].length; i++) {
					a[k][j][i] = scan.nextInt();
				}
			}
		}
		System.out.println("the marks of " + (m * n * p) + " Students are: ");
		for (int k = 0; k < a.length; k++) {
			for (int j = 0; j < a[k].length; j++) {
				for (int i = 0; i < a[k][j].length; i++) {
					System.out.print(a[k][j][i]);
				}System.out.println(" ");
			}System.out.println(" ");
		}
		scan.close();

	}

}
