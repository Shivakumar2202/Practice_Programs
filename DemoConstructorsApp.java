package com.kodnest.constructors;

class Student {
	String name;
	int id;
	String place;
	char gender;
	double marks;
	long contact_number;

	public Student(String A, int B, String C, char D, double E, long F) {
		name = A;
		id = B;
		place = C;
		gender = D;
		marks = E;
		contact_number = F;

	}
}

public class DemoConstructorsApp {
	public static void main(String[] args) {

		Student s1 = new Student("shivakumar", 100, "Bathi", 'm', 8.47, 7894561230l);

		Student s2 = new Student("manoj", 101, "Davangere", 'm', 8, 1213456789l);

		System.out.println("Name=" + (s1.name)
				+ " ID=" + (s1.id) + " Place=" + (s1.place) + " Gender=" + (s1.gender)
				+ " Marks=" + (s1.marks) + " Contact_number=" + (s1.contact_number));

		System.out.println("==================================================================================");

		System.out.println("Name=" + (s2.name) + " ID=" + (s2.id) + " Place=" + (s2.place) + " Gender=" + (s2.gender)
				+ " Marks=" + (s2.marks) + " Contact_number=" + (s2.contact_number));
	}

}
