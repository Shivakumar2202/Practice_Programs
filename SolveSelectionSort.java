package sort1;

public class SolveSelectionSort {
	void SolveSelectionSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
			}
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
			
			
		}
	}

}
