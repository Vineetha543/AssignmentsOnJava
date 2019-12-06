package innerclasses;

public class StaticInner {

	static void m1()
	{
		System.out.println("outer static method");
	}
	
	static class Inner
	{
	
		static void m2()
		{
			System.out.println("inner static class");
		}
       	
		void m3()
		{
			System.out.println("non static methos inside the inner class");
		}
	}
	public static void main(String[] args)
	{
       StaticInner.m1();
       StaticInner.Inner.m2();
       
       StaticInner.Inner s = new StaticInner.Inner();
       s.m3();
	}

}
