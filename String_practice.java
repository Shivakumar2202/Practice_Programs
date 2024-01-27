package String_progremms.level1;

public class String_practice {

	public static void main(String[] args) {
		String s = new String("Program");
		String s1 = new String("");
		for (int i = 0; i < s.length(); i++) {
			if (!(s1.contains(s.charAt(i) + ""))) {
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}

/* Note:- char + string = string; */
