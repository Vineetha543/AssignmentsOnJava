package collections;

import java.util.Set;
import java.util.TreeSet;

public class SortingObjects {

	public static void main(String[] args) {
		Set<EmployeeIdComparator> set = new TreeSet<>(new EmployeeNameComparator());
		set.add(new EmployeeIdComparator(100, "Tom"));
		set.add(new EmployeeIdComparator(400, "Joe"));
		set.add(new EmployeeIdComparator(300, "Jack"));
		set.add(new EmployeeIdComparator(200, "Jill"));
		
		for (EmployeeIdComparator emp : set) {
			System.out.println(emp.id);
			System.out.println(emp.name);
			
			
		}

	}

}
