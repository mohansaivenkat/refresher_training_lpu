package strings;

public class Example1 {
	public static void main(String[] args) {
		 StringBuffer sb1 = new StringBuffer();
	        System.out.println("Default Capacity: " + sb1.capacity());

	        
	        StringBuffer sb2 = new StringBuffer(50);
	        System.out.println("Capacity: " + sb2.capacity());

	        
	        StringBuffer sb3 = new StringBuffer(10);
//	        System.out.println(sb3.capacity());
	        sb3.append("hi My name is Naman Prakash And ravi is my good friend and he is also stuying with me");
	        System.out.println(sb3.length());
	        System.out.println(sb3.capacity());
//	        sb3.append("!");
//	        System.out.println(sb3.length());
//	        System.out.println(sb3.capacity());

	        
	        //capacity
	        //length
	        //append
	        //insert
	        //reverse
	        //charAt
	        //indexof
	        //lastindexof
	        //delete
	        //deletecharAt
	        //replace
	        //setcharAt
	}
}
