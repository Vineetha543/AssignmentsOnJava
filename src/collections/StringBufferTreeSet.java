package collections;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		Set<StringBuffer> set = new TreeSet<>(new StringBufferComparator());

		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("mno"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("ijk"));

		for (StringBuffer s : set) {
			System.out.println(s);

		}
	}

}
