package strings;

public class T7StringToStringArray {
public static void main(String[] args) {
	String s="Java is fun";
	String[] words=s.split(" ");


	for(String w:words) 
		System.out.println(w);
}
}
