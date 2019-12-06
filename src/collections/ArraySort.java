package collections;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {

		int[] a = { 40, 10, 15, 7 };

		System.out.println("Before Sorting");

		for (int eachElement : a) {
			System.out.println(eachElement);
		}

		Arrays.sort(a);
		System.out.println("After Sorting");

		for (int eachElement : a) {
			System.out.println(eachElement);
		}

		int binarySearch = Arrays.binarySearch(a, 15);

		System.out.println("Searched Element index is :" + binarySearch);

		String[] s = { "V", "A", "Z", "P" };

		Arrays.sort(s, new ComparatorList());

		for (String eachString : s) {
			System.out.println(eachString);
		}
		int binarySearch2 = Arrays.binarySearch(s, "Z");

		System.out.println("Searched string index is : " + binarySearch2);

		List<String> list = Arrays.asList(s);
		
		s[1] = "Y";
		
		
		  System.out.println(list);
	}

}
