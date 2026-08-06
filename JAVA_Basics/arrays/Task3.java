package arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int sum=0;
		
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum is : "+sum );
	
		
		
		

	}

}
