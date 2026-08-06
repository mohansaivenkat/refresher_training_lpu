package LinkedHashSet;

public class Teacher implements Comparable<Teacher> {
	int tid;
	String tname;
	String tdept;
	
	Teacher(int tid,String tname,String tdept){
		this.tid=tid;
		this.tname=tname;
		this.tdept=tdept;
	}
	@Override
    public String toString() {
        return "ID: " + tid + " | Name: " + tname + " | Department: " + tdept;

	}
	
	@Override
	public int compareTo(Teacher h) {
		return this.tid-h.tid;
	}
}
