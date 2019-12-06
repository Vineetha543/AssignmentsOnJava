package collections;

import java.util.TreeMap;

public class NavigableTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String,String> map = new TreeMap<>();
		
		map.put("abc", "Tom");
		map.put("def", "Joe");
		map.put("mno", "Jack");
		map.put("ijk", "Jill");
		map.put("xyz", "Jhon");
		
		System.out.println(map);
		
		System.out.println(map.floorKey("def"));
		
		System.out.println(map.lowerKey("mno"));
		
		System.out.println(map.ceilingKey("xyz"));
		
		System.out.println(map.higherKey("mno"));
		
		System.out.println(map.pollFirstEntry());
		
		System.out.println(map.pollLastEntry());
		
		System.out.println(map.descendingKeySet());
		
		System.out.println(map);

	}

}
