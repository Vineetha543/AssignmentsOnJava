package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortedList {

	public static void main(String[] args)

	{
		List<String> l = new ArrayList<>();

		l.add("Z");
		l.add("A");
		l.add("X");
		l.add("B");

		System.out.println("Before Sorting: " + l);

		Collections.sort(l);

		System.out.println("After sorting:" + l);
		
		int result = Collections.binarySearch(l,"X");
		
		System.out.println("Index is : " + result);
	}

}
