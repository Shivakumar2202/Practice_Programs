package com.kodnest.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your birthdate (yyyy-MM-dd): ");
		String birthdateStr = scanner.nextLine();
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date birthdate = dateFormat.parse(birthdateStr);
			long diffInMilliseconds = currentDate.getTime() - birthdate.getTime();
			long ageInMilliseconds = diffInMilliseconds;
			long ageInSeconds = ageInMilliseconds / 1000;
			long ageInMinutes = ageInSeconds / 60;
			long ageInHours = ageInMinutes / 60;
			long ageInDays = ageInHours / 24;
			long ageInYears = ageInDays/ 365;
			long ageInWeek = ageInDays / 7;
			long ageInMonths = ageInDays /31;
			System.out.println("Your age is approximately " + ageInYears + " Years."+((ageInDays%365)/31)+" Months");
			System.out.println("Your age is approximately " + ageInMonths + " Month."+((ageInDays%31)/7)+" weeks");
			System.out.println("Your age is approximately " + ageInWeek + " Weeks."+(ageInDays%7)+" Days");
			System.out.println("Your age is approximately " + ageInDays + " Days.");
			System.out.println("Your age is approximately " + ageInHours + " Hours.");
			System.out.println("Your age is approximately " + ageInMinutes + " Minutes.");
			System.out.println("Your age is approximately " + ageInSeconds + " Seconds.");
			System.out.println("Your age is approximately " + ageInMilliseconds + " Milliseconds.");

		} catch (ParseException e) {
			System.err.println("Invalid date format. Please enter your birthdate in yyyy-MM-dd format.");
		}
		scanner.close();
	}
}
