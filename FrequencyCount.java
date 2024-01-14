package String_progremms.level1;

public class FrequencyCount {
	void FrequencyCount(String s) {
		int[] a=new int[256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			a[ch]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				System.out.println("The Character "+(char)i+" Frequency is "+a[i]);
			}
		}
	}

}
