package strings;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1=" Naman Programming  ";
		String s2="Ravi";
		
		// concat 
		System.out.println(s1.concat(s2));
		
		//length
		System.out.println(s1.length());
		
		//charAt
		System.out.println(s1.charAt(3));
		
		//subString
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,12));
		
		//compareTo
		System.out.println(s1.compareTo(s2));
		
		//equals
		System.out.println(s1.equals(s2));
		
		//startsWith
		System.out.println(s1.startsWith("Naman"));
		
		//EndsWith
		System.out.println(s2.endsWith("Ravi"));
		
		//toUpperCase
		System.out.println(s1.toUpperCase());
		
		//toLowerCase
		System.out.println(s1.toLowerCase());
		
		//trim
		System.out.println(s1.trim());
		
		//split
		String s3="Welcome to Java to python";
		String[] s=s3.split("to");
		System.out.println(s[1]); 
		
		//replace
		// for string
		System.out.println(s1.replace('N', 'A'));
		// for stringBuffer
//		StringBuffer s4 = new StringBuffer("Naman Programming");
//		System.out.println(s4.replace(0, 2,"app"));
		
		//setCharAt
		StringBuffer s4 = new StringBuffer("Naman Programming");
//		System.out.println(s4.setCharAt(0, 'P'));
		
		//IndexOf
		System.out.println(s1.indexOf("N"));
		
		//lastIndexOf
		System.out.println(s2.lastIndexOf("i"));
		
		//Join
		System.out.println(String.join(s1," ",s2));
	}

}
