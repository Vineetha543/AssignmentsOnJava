package strings;

public class StringPoolExe {
	public static void main(String[] args) {

		StringPoolDemo demo1 = new StringPoolDemo(1, "abc");
		StringPoolDemo demo2 = new StringPoolDemo(2, "abc");
		
		System.out.println(demo1);
		System.out.println(demo2);

		String s1 = "abc";
		String s2 = "abc";
		String s3 = "abc";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode()); 	

	}
}
