package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		Object obj[] = new Object[100000];
		for (int i = 0; i < obj.length; i++) {
			obj[i] = new Object();
		}

		List<Object> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (Object object : obj) {
			list.add(object);

		}
		long end = System.currentTimeMillis();
		System.out.println("Time Taken : " + (end - start));

	}

}
