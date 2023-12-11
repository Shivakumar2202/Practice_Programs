package Level1;

public class BorderElements {

	public static void main(String[] args) {
		int[][] a = { { 4, 7, 8 }, { 9, 7, 6 }, { 3, 1, 2 } };
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[0][k]);
		}
		for(int k=1;k<a.length;k++) {
			System.out.println(a[k][a.length-1]);
		}
		for(int j=1;j>=0;j++) {
			System.out.println(a[a.length-1][j]);
		}
		for(int i=1;i>0;i--) {
			System.out.println(a[i][0]);
		}

	}

}
