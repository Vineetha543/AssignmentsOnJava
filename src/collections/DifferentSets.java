package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		Random r = new Random();

		HashSet<Integer> set1 = new HashSet();
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet();
		
		TreeSet<Integer> set3= new TreeSet();
		
		for(int i=1;i<=5;i++)
		{
			int num=r.nextInt(100);
			set1.add(num);
			set2.add(num);
			set3.add(num);
			System.out.println(num);
		}
		System.out.println("HashSet elements : " + set1);
		System.out.println("LinkedHashSet Elements : " + set2);
		System.out.println("TreeSet elements :" + set3);
		
		Iterator<Integer> i = set1.iterator();
	    
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    	i.remove();
	    }
	    System.out.println(set1);
	}
	

}
