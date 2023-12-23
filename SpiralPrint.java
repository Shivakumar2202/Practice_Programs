package sort1;

public class SpiralPrint {
	void SpiralPrint(int[][] a, int n, int m) {
		int i, k = 0, l = 0;
		while (k < n && l < m) {
			for (i = l; i < n; i++) {
				System.out.print(a[k][i] + " ");
			}
			k++;
			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + " ");
			}
			n--;
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + " ");
				}
				m--;
			}
			// prints the first column from the remaining columns
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + " ");
				}
				l++;
			}

		}
		System.out.println("  ");

	}

}
