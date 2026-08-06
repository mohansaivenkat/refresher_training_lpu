package exceptions;
import java.util.*;

public class Example2 {
	public static void main(String[] args) {

		try {
			System.out.println(10/0);
	}
		catch(ArithmeticException e) {
		System.out.println("handled in Catch-1");
	}
		
		catch(NullPointerException n) {
		System.out.println("handled in catch-2");
	}
		catch(Exception n) {                  // the parent should be always in the last
			System.out.println("handled in catch-3");
		}
		System.out.println("byee");
		
		
		
		//
		
//		try {
//			System.out.println(10/0);
//	}
//		catch(ArithmeticException e) {
//		System.out.println("handled in Catch-1");
//	}
//		catch(Exception n) {                  // the parent should be always in the last
//			System.out.println("handled in catch-3");
//		}
//		
//		catch(NullPointerException n) {
//		System.out.println("handled in catch-2");
//	}
//		
//		System.out.println("byee");
	}
}
