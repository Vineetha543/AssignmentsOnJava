package collections;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new StringComparator());
		
		set.add("abcdef");
		set.add("mnopqrstu");
		set.add("xyzabcccccc");
		set.add("ijk");
	   
		for (String s: set) {
			System.out.println(s);
			
		}
	}

}
