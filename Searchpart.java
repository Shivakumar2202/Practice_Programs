package level1;

public class Searchpart {
	void search(int a[],int ele,int first,int last) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(a[mid]<ele) {
				first=mid+1;
			}
			else if(a[mid]==ele) {
				System.out.println("Element is found at INDEX: "+mid);
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element is not found..!");
		}
	}

}
