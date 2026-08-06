package FunctionalProgramming;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;


public class Example4 {
	int age;
	String name;
	
	// static method to perform square(int a)
		static void square(int a) {
			System.out.print(a*a+ " ");
		}
	
	// non static method accepting String
		void display(int s) {
			System.out.print(s+" ");
		}
		
	// constructor with no argument
		Example4(){
			System.out.println("Hello form no argument constructor..");
		}
		
	// Constructor with argument to initialize name
		
	Example4(String name){
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		List<Integer> l=new ArrayList(Arrays.asList(2,3,5));
//		l.forEach(x->System.out.print(x+" "));
//		System.out.println();
		
//		l.forEach(x -> square(x));
		
		// static method using method reference
//		l.forEach(Example4 :: square);
		
		//create object  for non static method
//		Example4 e=new Example4();
//		l.forEach(e::display);
		
		// creating object for no arg constructor
//		Supplier<Example4> s=Example4::new;
//		s.get();
		
		// create object for parameterized constructor
		Function<String,Example4> f=Example4::new;
		f.apply("Naman");
		
		
	}
	
	
}
