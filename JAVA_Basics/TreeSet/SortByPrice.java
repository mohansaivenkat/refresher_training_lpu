package TreeSet;
import java.util.Comparator;

public class SortByPrice implements Comparator<Biryani> {
	public int compare(Biryani b1, Biryani b2) {
		if(b1.bprice==b2.bprice) {
			 b1.bname.compareTo(b2.bname);
		}
		return b1.bprice-b2.bprice;
	}
}
