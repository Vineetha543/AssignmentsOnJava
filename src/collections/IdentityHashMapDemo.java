package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new IdentityHashMap<>();
		
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		
		map.put(id1,"Tom");
		map.put(id2, "Joe");
		
		System.out.println(map);

	}

}
