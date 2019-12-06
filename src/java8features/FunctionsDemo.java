package java8features;

import java.util.function.Function;

public class FunctionsDemo {

	public static void main(String[] args) {

		Function<String,Integer> f = s->s.length();
		
		System.out.println(f.apply("Tom"));
		System.out.println(f.apply("Bean"));
	}

}
