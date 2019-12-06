package strings;

public class StringComparison {
	
	public static void main(String[] args) {

		StringPoolDemo demo1 = new StringPoolDemo(1, "abc");
		StringPoolDemo demo2 = new StringPoolDemo(1, "abc");
		
		System.out.println(demo1);
		System.out.println(demo2);

		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abc";
		String s4 = new String("abc");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode()); 	
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1 ==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		
		System.out.println(demo1 == demo2);
		System.out.println(demo1.equals(demo2));
		
		

		
	}
}
