package com.kodnest.method.L2;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="shivakumar";
		System.out.println(e.name);
		e.id=22022001;
		System.out.println(e.id);
		e.contact=9353220;
		System.out.println(e.contact);
		e.place="davangere";
		System.out.println(e.place);
		e.work();
		e.sleep();

	}

}
