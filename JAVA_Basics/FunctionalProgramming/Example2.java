package FunctionalProgramming;
import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,66,30,20,50,12);
		
		// for each using lambda expression
		//list.forEach(n->System.out.println(n));
		
		// sort using lambda 
        // Collections.sort(list,(a,b)->a.compareTo(b));   // be default ascending order
		// OR
		Collections.sort(list,(a,b)->a-b);
		System.out.println(list);
	   // descending order
	   // Collections.sort(list,(a,b)->b-a);
	   // System.out.println(list);
		
		
		// sorting elements using lambda more shorter
		list.sort((a,b)->b-a);    // descending order
		System.out.println(list);
	}
}
