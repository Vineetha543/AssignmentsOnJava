package java8features;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {

		int[] x = {0,7,10,20,30,40,50,60,70,73};
		
		Predicate<Integer> p1 = i->i>10;
		Predicate<Integer> p2 = i->i%2==0;
		
		System.out.println("Greater than 10 : ");
		method1(p1,x);		
		
		System.out.println("Even numbers : ");
		method1(p2,x);
		
		System.out.println("Not greater than 10 : ");
		method1(p1.negate(),x);
		
		System.out.println("Not even : ");
		method1(p2.negate(),x);
		
		System.out.println("Greater than 10 and Even : ");
		method1(p1.and(p2), x);
		
		System.out.println("Greater than 10 or Even : ");
		method1(p1.or(p2), x);
	}

	static void method1(Predicate<Integer> p, int[]  x)
	{
		for (int eachValue : x) {
			if(p.test(eachValue))
			{
				System.out.println(eachValue);
			}
			
		}
	}

}
