package String_progremms.level1;

public class AddingString {
	String AddingString(String s1,String s2,String s3) {
		String empt="";
		for(int i=0;i<s1.length();i++) {
			empt=empt+s1.charAt(i);
		}
		empt=empt+" ";
		for(int i=0;i<s2.length();i++) {
			empt=empt+s2.charAt(i);
		}
		empt=empt+" ";
		for(int i=0;i<s3.length();i++) {
			empt=empt+s3.charAt(i);
		}
		return empt;
	}

}
