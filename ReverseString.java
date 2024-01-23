package String_progremms.level1;

public class ReverseString {

	public static void main(String[] args) {
		String s = "abc";
		String temp="";
		for (int i = s.length()-1; i >=0; i--) {
			/*for (int j = i+1; j <= s.length(); j++) {
				if (i <= j) {
					System.out.println(s.substring(i, j));
				}
			}*/
			temp=temp+s.charAt(i);
		}
		System.out.println(temp);

	}

}
