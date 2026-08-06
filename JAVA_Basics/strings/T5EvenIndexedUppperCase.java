package strings;

public class T5EvenIndexedUppperCase {

	public static void main(String[] args) {
		String s="abcdef";
		char[] arr=s.toCharArray();

		for(int i=0;i<arr.length;i++){
		if(i%2==0) {
			arr[i]=Character.toUpperCase(arr[i]);
		}
	}

		System.out.println(new String(arr));
	}

}
