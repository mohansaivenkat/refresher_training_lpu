package Collection_Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Example {
public static void main(String[] args) {
	Queue q=new LinkedList();
	q.add(10);
	q.add(56);
	q.add(45);
	q.add(93);
	q.add(2);
   //   retrieve and remove elements but not 
   //	 System.out.println(q.poll());

	// retrieve elements but not remove
	System.out.println(q.peek());
	
	// it retrieve the elements on the top
	System.out.println(q.element());
	
	System.out.println(q.contains(45));
	System.out.println(q);
	
	
//	while(!q.isEmpty()) {
//	System.out.println(q.poll());
//}
	
}
}
