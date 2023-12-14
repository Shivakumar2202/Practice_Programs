package Level1;

import java.util.Scanner;

public class ReadandDisplayObject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee e[]=new Employee[5];
		
		System.out.println("Enter the employee object: ");
		for(int i=0;i<e.length;i++) {
			e[i]=new Employee();
		}
		
		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter the employee "+i+" name: ");
			e[i].name=scan.nextLine();
		}
		System.out.println("The employee are");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].name);
		}

	}
}

class Employee {
	String name;
}
