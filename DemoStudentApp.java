package com.kodnest.method.L2;

public class DemoStudentApp {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
		s.name="shivu";
		System.out.println(s.name);
		s.id=400;
		System.out.println(s.id);
		s.study();
		s.sleep();
		s.eat();
	}
}


