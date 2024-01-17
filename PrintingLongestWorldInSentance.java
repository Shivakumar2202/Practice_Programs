package String_progremms.level1;

public class PrintingLongestWorldInSentance {

	public static void main(String[] args) {
		String s="                     Java is one of the programming language                           ";
		String s1=s.trim();
		String[] split=s1.split(" ");
		String max="";
		for(int i=0;i<split.length;i++) {
			if(split[i].length()>max.length()) {
				max=split[i];
			}else {
				continue;
			}
		}
		System.out.println(max);

	}

}
