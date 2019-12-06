package strings;

public class Immutable1 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "world";
		
		System.out.println("before concat" + "\ns1:" +s1+ "\ns2:" + s2);
		
		s1 = s1.concat(s2);
		
		System.out.println("after concat" + "\ns1:" +s1+ "\ns2:" + s2);
	}

}
