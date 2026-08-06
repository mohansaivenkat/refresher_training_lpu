package arrays;
import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] arr1=new int[n];
		int index=0;
		
		for(int i=0;i<n;i++){
			if(arr[i]!=0) {
				arr1[index++]=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
