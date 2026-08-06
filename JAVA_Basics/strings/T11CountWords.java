package strings;

public class T11CountWords {

	public static void main(String[] args) {
		String s="Java is very easy";
		String[] words=s.trim().split(" ");
		System.out.println(words.length);
	}

}
