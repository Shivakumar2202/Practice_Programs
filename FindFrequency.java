package String_progremms.level1;

public class FindFrequency {

	public static void main(String[] args) {
		String str = "program";
		char[] ch1=str.toCharArray();
		java.util.Arrays.sort(ch1);
		String s=new String(ch1);
		String s1 = "";
		for (int j = 0; j < s.length(); j++) {
			char ch = s.charAt(j);
			int count = 0;
			if (!(s1.contains(ch + ""))) {
				s1 = s1 + ch;
				for (int i = 0; i < s.length(); i++) {
					if (ch == s.charAt(i)) {
						count++;
					}
				}
				System.out.println("The ferquency of " + ch + " is " + count);
			}
		}
	}

}
