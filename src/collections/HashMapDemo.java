package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) 
	{
        Map<String,Integer> map = new HashMap<>();
        map.put("tom",80);
        map.put("joe",70);
        map.put("jill",98);
        map.put("jhon",90);
        
        Set<String> keySet = map.keySet();
        System.out.println("Keys:" + keySet);
        
        Collection<Integer> values = map.values();
        System.out.println("Values:" + values);
        
        for(String key : keySet)
        {
        	System.out.println("Keys:" + key + " Value:" + map.get(key));
        }
        
   
	}

}
