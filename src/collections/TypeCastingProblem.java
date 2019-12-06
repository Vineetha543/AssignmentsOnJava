package collections;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {

	public static void main(String[] args) {

		String[] s = new String[10];
		s[0] = "Tom";
		s[1] = "Jeo";

		List<String> l = new ArrayList<>();

		l.add("jhon");
		l.add("Joe");

		
		String name =  (String) l.get(0);
		String name1 = (String) l.get(1);
		
		System.out.println(name);
		System.out.println(name1);
		
	}

}
