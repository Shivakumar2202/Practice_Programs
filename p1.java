import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		float a=scan.nextFloat();
		System.out.println("Enter the first number");
		float b=scan.nextFloat();
		System.out.println("Enter the first number");
		float c=scan.nextFloat();
		
		if(a>=b && a>=c)
			System.out.println(a+" is the largest number");
		
		else 
			if(b>=a && b>=c)
			System.out.println(b+" is the largest numbre");
		
		else 
			System.out.println(c+" is the largest number");
		scan.close();

	}

}

	