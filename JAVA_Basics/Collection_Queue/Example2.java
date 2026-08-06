package Collection_Queue;
import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
//		a.remove();
//		a.poll();
//		a.peek();
		
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
	}

}
