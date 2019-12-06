package collections;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {

		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println(set);
		
		System.out.println(set.ceiling(20));
		
		System.out.println(set.higher(40));
	
		System.out.println(set.floor(50));
		
		System.out.println(set.lower(40));
		
		System.out.println(set.pollFirst());
		
		System.out.println(set.pollLast());
		
		System.out.println(set.descendingSet());
		
		System.out.println(set);
	}
	

}
