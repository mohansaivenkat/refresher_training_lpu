package ObjectClass;

public class Student {
	int sid;
	String name;
	
	Student(int sid, String  name){
		this.sid=sid;
		this.name=name;
	}
	// override the toString() method to print properties
	public String toString() {
		return "Sid: "+sid+" , "+"Name: "+name;
	}
	
	// override the equals method to compare properties
	public boolean equals(Object o) {  // up Casting here so we can not access the child members
		Student s=(Student)o;          // down Casting
		return this.sid==s.sid && this.name==s.name;
	}
	
	// override the hashCode method to give unique integer value
	public int hashCode() {
		return sid+name.hashCode();
	}
}
