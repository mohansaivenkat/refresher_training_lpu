package arrays;
import java.util.Scanner;
public class Task12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
		}
		int avg=sum/n;
		System.out.println("Average is : " +avg);
		
	
	}

}
