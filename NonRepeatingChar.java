package String_progremms.level1;

import java.util.Scanner;

public class NonRepeatingChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1=scan.next();
		
		char[] charcount=new char[256];
		
		
		for(int i=0;i<s1.length();i++) {
			charcount[s1.charAt(i)]++;
		}
		for (int i = 0; i < s1.length(); i++) {
			if(charcount[s1.charAt(i)]==0) {
				System.out.println(s1.charAt(i));
				break;
			}
		}
		scan.close();

	}

}
