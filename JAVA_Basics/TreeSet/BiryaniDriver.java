package TreeSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;


public class BiryaniDriver {
	public static void main(String[] args) {
		TreeSet<Biryani> t=new TreeSet<>(new SortByPrice());
		t.add(new Biryani(101,"Hyderabadi",599));
		t.add(new Biryani(108,"Dum-Biryani",599));
		t.add(new Biryani(107,"Special",999));
		t.add(new Biryani(104,"Roasted Biryani",299));
		t.add(new Biryani(105,"Mandi",2000));
		

//		Collections.sort(t,new SortByPrice());
		
		for(Biryani a:t) {
			System.out.println(a);
		}
		
	}
}
