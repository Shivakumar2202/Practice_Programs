package String_progremms.level1;

import java.util.Scanner;

public class DisplayFrequencycount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the string ");
		String s=scan.nextLine();
		FrequencyCount count=new FrequencyCount();
		count.FrequencyCount(s);
		scan.close();

	}

}
