package ObjectClass;

public class StudentDriver {
public static void main(String[] args) {
	Student s1=new Student(101,"Naman");
	Student s2=new Student(101,"Naman");
	
//	System.out.println(s.toString());
	
//	System.out.println(s1.equals(s2));
//	System.out.println(s==s1);
	
//	System.out.println(s.sid);
//	System.out.println(s.name);
//	System.out.println(s1.hashCode());
//	System.out.println(s2.hashCode());
//	System.out.println(s1.hashCode()==s2.hashCode());
	
	System.out.println(s1.getClass());    // gives full class name along with package name along with component
	System.out.println(s1.getClass().getName());    //gives only className along with package
	System.out.println(s1.getClass().getSimpleName());  // gives only className
//	System.out.println(s1.getClass().getModifiers());   // gives no of modifiers
	System.out.println(s1.getClass().getPackageName()); // gives package name
	
}
}
