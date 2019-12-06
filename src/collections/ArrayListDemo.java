package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(30);
    list.add(20);
    list.add(19);
    list.add(43);
    
    
    
    Iterator<Integer> i = list.iterator();
    
    while(i.hasNext())
    {
    	System.out.println(i.next());
    	i.remove();
    }
    System.out.println(list);
	}

}
