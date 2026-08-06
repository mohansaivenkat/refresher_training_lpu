package exceptions;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("hai........!!");
		try {
			System.out.println(10/0);
			System.out.println("from try.....!");   // it will not execute as after error it will jump to catch 
		}catch(ArithmeticException e) {
			System.out.println("handled.....!");
		}finally {
			System.out.println("from finally......!!");
		}
		System.out.println("byee..........!");
	}

}
