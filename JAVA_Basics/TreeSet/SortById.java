package TreeSet;
import java.util.Comparator;

public class SortById implements Comparator<Biryani>{
	public int compare(Biryani b1, Biryani b2) {
		return b1.bid-b2.bid;
	}

}
