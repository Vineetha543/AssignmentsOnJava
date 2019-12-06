package innerclasses;

public class NonStaticInner 
{
	void m1()
	{
		System.out.println("outer class non static method");
	}
   class Inner{

	   private void m2()
	   {
		   System.out.println("inner class non static method");
	   }
   }
   public static void main(String[] args) {
	
	   
	   NonStaticInner s = new NonStaticInner();
	   s.m1();
	   NonStaticInner.Inner i=s.new Inner();
	   i.m2();
}
}
