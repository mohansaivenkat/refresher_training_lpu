package exceptions;


public class Example1 {
	int price;
	public static void main(String[] args) {
//		Example e=null;
//		System.out.println(e.price);   // Null pointer Exceptions
		
		
//		System.out.println("hai");
//		System.out.println("byee");
//		System.out.println(10/0);        // Arithematic Exception  / by Zero
//		System.out.println("hyeeee");
		
		try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("handled successfully......!!!!");
        }
		System.out.println("bye");
		
		
		
		// one more Scenarios
//		try {
//            int a = 10;
//            int b = 0;
//            System.out.println(a / b);
//        } catch (Throwable e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println("handled successfully......!!!!");
//        }
//		System.out.println("bye");
		
		
		
		// one more Scenario
//		try {
//            int a = 10;
//            int b = 0;
//            System.out.println(a / b);
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println("handled successfully......!!!!");
//        }
//		System.out.println("bye");

	}

}
