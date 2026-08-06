package LinkedHashSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class TeacherDriver {

	public static void main(String[] args) {
		HashSet<Teacher> h=new HashSet<>();
		
		h.add(new Teacher(101,"Ravi","SQL"));
		h.add(new Teacher(109,"Shraddha","SDLC"));
		h.add(new Teacher(105,"Naman","Selenium"));
		h.add(new Teacher(102,"Divyansh","React"));
		h.add(new Teacher(103,"Utkarsh","Backend"));

        ArrayList<Teacher> list = new ArrayList<>(h);
        
		Collections.sort(list);   // sorting does not work with HashSet it works only in list
		
		System.out.println("After Sorting");
		for(Teacher a:list) {
			System.out.println(a);
		}
	}

}
