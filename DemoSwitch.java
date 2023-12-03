package com.kodnest.ccswitch;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User please enter the day number: ");
		String day_no = s.next();
		switch (day_no) {
		case "sun":
			System.out.println("Sunday");
			break;
		case "mon":
			System.out.println("Monday");
			break;
		case "tue":
			System.out.println("Tuesday");
			break;
		case "wed":
			System.out.println("Wednesday");
			break;
		case "thu":
			System.out.println("Thursday");
			break;
		case "fri":
			System.out.println("Friday");
			break;
		case "sat":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
		}
		s.close();

	}

}
