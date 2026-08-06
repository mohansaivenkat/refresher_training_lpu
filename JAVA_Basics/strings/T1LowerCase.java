package strings;

public class T1LowerCase {

	public static void main(String[] args) {
		String s="HELLO";
		String r="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
				r+=ch;
			}
			}
		System.out.println(r);

	}

}
