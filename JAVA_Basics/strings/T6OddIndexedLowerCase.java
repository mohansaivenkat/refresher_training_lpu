package strings;

public class T6OddIndexedLowerCase {

	public static void main(String[] args) {
		String s="HELLLO";
		char[] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				arr[i]=Character.toLowerCase(arr[i]);
			}
		}
		System.out.println(new String(arr));
		
	}

}
