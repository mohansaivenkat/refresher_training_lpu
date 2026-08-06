package strings;

public class Example {
	public static void main(String[] args) {
		String s1="hiee";
		String s2="bye";
		System.out.println(s1==s2);       // compares reference
		System.out.println(s1.equals(s2)); // compares content
		
		String s3=new String("hiee");
		System.out.println(s1==s3);       // compares reference
		System.out.println(s1.equals(s3)); // compares content
		
		
		
		
	}
}
