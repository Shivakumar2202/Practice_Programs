package Level1;

import java.util.Scanner;

public class ArrayJagged3D {

	public static void main(String[] args) {
		int[][][] a=new int[2][][];
		a[0]=new int[2][];
		a[1]=new int[1][];
		a[0][0]=new int[3];
		a[0][1]=new int[2];
		a[1][0]=new int[2];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k]=scan.nextInt();
					
				}				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k]);
				}				
				System.out.println();
			}
			System.out.println();
			
		}
		
		

	}

}
