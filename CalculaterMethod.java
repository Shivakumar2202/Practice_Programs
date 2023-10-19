package com.kodnest.practice1;

import java.util.Scanner;

public class CalculaterMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("User! please enter the operator to perform(+,-,*,/,%): ");
			char c = scan.next().charAt(0);
			switch (c) {
			case '+':
				Addition1 Add = new Addition1();
				int res1 = Add.Addition();
				System.out.println("the sum is: " + res1);
				System.out.println("===========================================");
				break;
			case '-':
				Substraction1 sub = new Substraction1();
				int res2 = sub.Substraction();
				System.out.println("The Difference is: " + res2);
				System.out.println("===========================================");
				break;
			case '*':
				Multiplication1 mult = new Multiplication1();
				int res3 = mult.Multiplication();
				System.out.println("The product of number is: " + res3);
				System.out.println("===========================================");
				break;
			case '/':
				Quatient1 quat = new Quatient1();
				int res4 = quat.Quatient();
				System.out.println("The Quatient of two number is: " + res4);
				System.out.println("===========================================");
				break;
			case '%':
				Remainder1 rem = new Remainder1();
				int res5 = rem.Remainder();
				System.out.println("The remainder of two number is: " + res5);
				System.out.println("===========================================");
				break;
			case '0':
				System.out.println("==================!EXIT!===================");
				scan.close();
				break;
			default:
				System.out.println("!!INVALID INPUT!!");
				System.out.println("===========================================");
				break;
			}
		}

	}

}
