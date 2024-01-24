package String_progremms.level1;

public class ReverseStringWithSpace {

	public static void main(String[] args) {
		String s = "java is fun";
		char[] a = new char[s.length()];
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				a[i] = s.charAt(i);
			}
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (a[j] == ' ') {
				j++;
				i++;
				continue;

			} else if (s.charAt(i) != ' ') {
				a[j] = s.charAt(i);
				j++;
			} else {
				continue;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}
}
