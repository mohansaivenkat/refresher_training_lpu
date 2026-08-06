package FunctionalProgramming;

public class Employees {
	private int eid;
	private String ename;
	private int esalary;
	
	public Employees(int eid, String ename, int esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

}
