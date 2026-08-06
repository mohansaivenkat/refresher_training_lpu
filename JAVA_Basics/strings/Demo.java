package strings;

// immutability
public class Demo {
	public static void main(String[] args) {
		String s1="hai";
		String s2="bye";
		String s3=s2;
		System.out.println(s3==s2);  // true
		 s2="Hello";
		System.out.println(s3==s2);  // false
	}
}
