package FunctionalProgramming;

public class Student {
	int sid;
	String sname;
	int marks;
	
	Student(int sid,String name,int marks){
		this.sid=sid;
		this.sname=name;
		this.marks=marks;
	}
	
	public int getSid() {
		return sid;
	}
	
	public String getSname() {
		return sname;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public String toString() {
		return "Id: "+sid+"| Name:  "+sname+"| Marks: "+marks;
	}
}
