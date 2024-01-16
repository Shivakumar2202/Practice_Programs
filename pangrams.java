package String_progremms.level1;

public class pangrams {

	public static void main(String[] args) {
		String s = "abcd efghijkl mnopqrst uvwx yz";
		String s1 = s.toLowerCase();
		boolean a[] = new boolean[26];
		for (int i = 0; i < s1.length(); i++) {
			int ch = s1.charAt(i);
			if (ch == ' ') {
				continue;
			} else {
				a[ch - 'a'] = true;
			}
		}
		boolean pangram=false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == false) {
				pangram=false;
				break;
			}
			else {
				pangram=true;
			}
		}
		if(pangram==true) {
		System.out.println("Is pangrams");
		}
		else {
			System.out.println("not pangrams");
		}

	}

}
//abcd efghijkl mnopqrst uvwx yz
