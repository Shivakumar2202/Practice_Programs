package String_progremms.level1;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramORnot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		
		for(int i=0;i<charArray1.length;i++) {
			System.out.print(charArray1[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<charArray1.length;i++) {
			System.out.print(charArray2[i]+" ");
		}
		
		String str1=new String(charArray1);
		String str2=new String(charArray2);
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
		

	}

}
