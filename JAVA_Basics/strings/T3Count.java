package strings;

public class T3Count {

	public static void main(String[] args) {
		String s="Hello123!67434$%^&**(hvdjvhHGVYGDHVU";
		int v=0, c=0, d=0, sp=0;
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if("aeiouAEIOU".indexOf(ch)!=-1) {
				v++;
			}
			else if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z') {
				c++;
			}
			else if(ch>='0'&&ch<='9') {
				d++;
			}
			else {
				sp++;
			}
			}


			System.out.println("Vowels="+v);
			System.out.println("Consonants="+c);
			System.out.println("Digits="+d);
			System.out.println("Special="+sp);
	}

}
