package FunctionalProgramming;
import java.util.*;

public class Example3 {
	public static void main(String[] args) {
//		HashMap<Integer,String> map=new HashMap<>();
//		map.put(101, "Naman");
//		map.put(102, "Ravi");
//		map.put(103, "Utkarsh");
//		
//		map.forEach((k,v)->System.out.println(k+", "+v));
		
		
		// this we cannot add because the array is of fixed size
//		List<Integer> list=Arrays.asList(10,29,65,43,87);
//		list.add(111);  
//		System.out.println(list);
		
		
//		List<Integer> list=new ArrayList<>(Arrays.asList(10,20,80,65,40,87));
//		list.add(111);  
//		list.sort((a,b)->a-b);    // sorting using lambda
//		System.out.println(list);
		
		// to remove the even elements from collections
		// using inbuilt method
		// list.removeIf(x->x%2==0);
		// System.out.println(list);
		
		
//		list.replaceAll(x->x*3);
//		System.out.println(list);
		
//		list.replaceAll(x->(x%2==0) ? 0:x);
//		System.out.println(list);
		
//		List<String> l=new ArrayList(Arrays.asList("Naman","ravi","heyyy","hello"));
//		l.replaceAll(x->x.toUpperCase());
//		System.out.println(l);

		
//		List<String> l=new ArrayList(Arrays.asList("Java","Naman","ravi","heyyy","hello"));
//		l.replaceAll(x->(x.length()> 4) ? x.substring(0,4):x);
//		l.replaceAll(x->x.replace("a","*"));
//		System.out.println(l);
		
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student(101,"Naman",76));
		s.add(new Student(102,"Ravi",90));
		s.add(new Student(103,"Divyansh",56));
		s.add(new Student(104,"Abc",66));
		s.add(new Student(105,"Utkarsh",96));
		
		s.sort((x,y)->x.getMarks()-y.getMarks());
		s.forEach(x -> System.out.println(x));

		
	}
}
