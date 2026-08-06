package strings;

public class T1UpperCase {

	public static void main(String[] args) {
		String s="hello";
		String r="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
				r+=ch;
			}
			}
		System.out.println(r);
	}

}
