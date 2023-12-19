package sort1;

public class RightRotation {
	void rightrotation(int a[], int k, int n) {
		for (int i = 0; i < k; i++) {
			rotatearraybyone(a, n);
		}
	}

	static void rotatearraybyone(int[] a, int n) {
		int i, temp;
		temp = a[n - 1];
		for (i = n - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0]=temp;

	}

}
