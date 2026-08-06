package TreeSet;

public class Biryani {
	int bid;
	String bname;
	int bprice;
	
	Biryani(int bid,String bname,int bprice){
		this.bid=bid;
		this.bname=bname;
		this.bprice=bprice;
	}
	@Override
	public String toString() {
	    return "ID: " + this.bid + " | Name: " + this.bname + " | Price: " + this.bprice;
	}
	
}
