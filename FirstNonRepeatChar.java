package String_progremms.level1;

import java.util.Scanner;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1=scan.next();
		
		for(int i=0;i<s1.length();i++) {
			String ch=s1.charAt(i)+"";
			if(s1.substring(i+1).contains(ch)) {
				continue;
			}
			else {
				System.out.println("the first non repeating character is "+ch);
				break;
			}
		}
		scan.close();

	}

}
