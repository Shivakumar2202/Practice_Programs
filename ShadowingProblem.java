package com.kodnest.shadowingproblem;

import java.util.Scanner;

public class ShadowingProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=100;i++) {
		System.out.println("Enter the name: ");
		String Name = sc.next();
		System.out.println("Enter the age: ");
		int Age = sc.nextInt();
		System.out.println("Enter the id: ");
		int Id=sc.nextInt();
		System.out.println("Enter the place: ");
		String Place=sc.next();
		System.out.println("Enter the gender: ");
		char Gender=sc.next().charAt(0);
		System.out.println("Enter the contact: ");
		long Contact=sc.nextLong();
		Studentsol s = new Studentsol(Name, Age,Id,Place,Gender,Contact);
		System.out.println("-----------------------------------------");
		System.out.println("The name of the student is "+s.name);
		System.out.println("The age of the student "+s.age+" years");
		System.out.println("The id of the student "+s.id);
		System.out.println("The place of the student "+s.place);
		System.out.println("The gender of the student "+s.gender);
		System.out.println("The contact of the student "+s.contact);
		System.out.println("-----------------------------------------");
		}
		sc.close();

	}

}
