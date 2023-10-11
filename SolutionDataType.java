package com.kodnest.project1;
import java.util.Scanner;
class SolutionDataType {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("User! please enter your name=");
		String s=scan.nextLine();
		System.out.print("enter the joining date=");
		int i=scan.nextInt();
		System.out.print("which batch you have joined=");
		char c=scan.next().charAt(0);
		System.out.println("  ");
		System.out.println("your name:"+s);
		System.out.println("date of joine:"+i);
		System.out.println("bvatch:"+c+"1");
		System.out.println("yes(1) or no(0):");
		int a=scan.nextInt();
		if(a==1)
			System.out.println("welcome to kodnest");
		else
			System.out.println("please check once again");
		System.out.println();
		scan.close();
	}

}
