package arrays;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		 int sum=0; int sum1=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}else {
				sum1+=arr[i];
			}
		}
		
		System.out.println("Even : "+sum);
		System.out.println("Odd : "+sum1);
		System.out.println("TOtal sum "+(int)(sum+sum1));
	}

}
