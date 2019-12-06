package collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		for (int i = 10; i <= 100; i += 10) {
			list1.add(i);
		}

		System.out.println("List : " + list1);

		list1.add(2, 100);

		System.out.println("List After Insert : " + list1);

		list1.set(3, 200);

		System.out.println("List After Replacement : " + list1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);

		System.out.println("Second List:" + list2);

		list1.addAll(4, list2);

		System.out.println("FirstList : " + list1);

		if (list1.contains(222)) {
			System.out.println("List has the value");
		} else {
			System.out.println("List does not have the value");

		}
		
		System.out.println("Elements in th list");
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		list1.remove(3);
		
		System.out.println("List after deletion : " + list1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
