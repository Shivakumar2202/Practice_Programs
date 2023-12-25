package sort1;

public class SpiralPrint2 {
	void SpiralPrint2(int[][] a, int n, int m) {
		int i, k = 0, l = 0;
		while (k < n && l < m) {
			for (i = k; i < n; i++) {
				System.out.print(a[i][l] + " ");
			}
			l++;
			for (i = l; i < n; ++i) {
				System.out.print(a[n - 1][i] + " ");
			}
			n--;
			if (k < m) {
				for (i = n - 1; i >= k; i--) {
					System.out.print(a[i][n] + " ");
				}
				m--;
				
			}
			if(l<n) {
				for(i=m-1;i>=l;--i) {
					System.out.print(a[k][i]+" ");
				}
				k++;
			}
		}
	}

}
