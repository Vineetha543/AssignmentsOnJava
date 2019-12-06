package java8features;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		Predicate<String> p = s -> (s.length() > 5);

		System.out.println(p.test("xyz"));
		System.out.println(p.test("vineetha"));
	}

}
