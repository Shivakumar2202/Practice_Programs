package String_progremms.level1;

import java.util.Scanner;

public class DisplayStrCompare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string 1");
		String s1=scan.next();
		System.out.println("Enter string 2");
		String s2=scan.next();
		StrCompareUsingCharAt compare=new StrCompareUsingCharAt();
		boolean result=compare.StrCompareUsingCharAt(s1, s2);
		if(result) {
			System.out.println("Given Two strings are equal");
		}else {
			System.out.println("Given Two strings are not equal");
		}
		scan.close();
		

	}

}
