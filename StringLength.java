package String_progremms.level1;

public class StringLength {

	public static void main(String[] args) {
		String s = "program";
		/*
		 * for(int i=s.length()-1;i>=0;i--) { System.out.print(s.charAt(i));
		 * /*if(i<s.length()-1) { System.out.print("-"); } }
		 */
		/*
		 * int i=0; while(i<s.length()) { System.out.print(s.charAt(i)); i++; }
		 * System.out.println("  // using while"); int j=0; do {
		 * System.out.print(s.charAt(j)); j++; }while(j<s.length());
		 * System.out.println("  // using do while");
		 */
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println("  //Even index char ");
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println("   //Odd index char  ");
		for (int i = 0; i < s.length(); i++) {
			if (i % 3 == 0 && i % 2 == 0) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println("   //Index devisible by 3 && 2 ");

	}

}
