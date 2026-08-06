package FunctionalProgramming;

import java.util.Arrays;
import java.util.*;

public class Example5 {
	public static void main(String[] args) {
		// Arrays dont have Streams
//		int[] arr= {10,20,31,40,53};
//		Arrays.stream(arr)
//		.filter(x->x%2==1)
//		.forEach(System.out::println);
		
		
//		List<Integer> list=new ArrayList(Arrays.asList(10,20,5,7,21,24));
//		list.stream()
//		.filter(x->(x%3==0 && x%5==0))
//		.forEach(System.out::println);
		
//		list.stream()
//		.filter(x->(x%2==1))
//		.map(x->x*x)
//		.forEach(System.out::println);
		
		
		List<String> list=new ArrayList(Arrays.asList("Naman","Aman","Ravi","anand","Heyy","Divyansh"));
//		list.stream()
//		.filter(x->(x.startsWith("A")||x.startsWith("a")))
//	    .forEach(System.out::println);
		
		list.stream()
		.map(x->x.toUpperCase())
	    .forEach(System.out::println);
		
		
		list.stream()
		.map(x->x.toLowerCase())
	    .forEach(System.out::println);
		
		list.stream()
		.filter(x->x.length()>3)
	    .forEach(System.out::println);
		
	}
	
}
