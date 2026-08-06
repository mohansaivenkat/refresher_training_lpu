package FunctionalProgramming;
import java.util.*;

public class EmployeeDriver {
	public static void main(String[] args) {
		List<Employees> e = new ArrayList<>();
		e.add(new Employees(101,"Naman",50000));
		e.add(new Employees(102,"Aman",20000));
		e.add(new Employees(103,"Ravi",90000));
		e.add(new Employees(104,"Divyansh",30000));
		e.add(new Employees(105,"Utkarsh",80000));
		
		e.stream()
		.filter(x->x.getEsalary()>25000)
		.map(x->x.getEname())
		.forEach(System.out::println);

		
	}
}
