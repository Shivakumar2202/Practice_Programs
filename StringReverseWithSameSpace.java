package String_progremms.level1;

public class StringReverseWithSameSpace {

	public static void main(String[] args) {
		String s = "java is a fun";
		char[] ch = s.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		while (left < right) {
			if (ch[left] != ' ' && ch[right] != ' ') {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			} else if (ch[left] == ' ') {
				left++;
			} else if (ch[right] == ' ') {
				right--;
			}
		}
		System.out.println(new String(ch));

	}

}
