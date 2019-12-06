package collections;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExe {

	public static void main(String[] args) throws InterruptedException {

		
		
		Map<WeakHashMapDemo,String> map = new WeakHashMap<>();
		
		WeakHashMapDemo w = new WeakHashMapDemo(); //123
		map.put(w,"Tom");
		
		System.out.println(map);
		
		w = null;
		
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}

}
