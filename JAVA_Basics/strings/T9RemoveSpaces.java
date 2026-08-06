package strings;

public class T9RemoveSpaces {

	public static void main(String[] args) {
		// using regex
			String s="a b c";
			System.out.println(s.replaceAll("\\s",""));
	}

}
