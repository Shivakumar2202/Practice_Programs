package String_progremms.level1;

import java.util.Scanner;

public class DisplayAddedString {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter three String ");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		String str3=scan.nextLine();
		AddingString Add=new AddingString();
		String result=Add.AddingString(str1, str2, str3);
		System.out.println("The Added String is:- "+result);

	}

}
