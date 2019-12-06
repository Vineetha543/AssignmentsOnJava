package innerclasses;

public class LocalInnerClass {
	void m1()
	{
		System.out.println("inside outer m1()");
		class LocalInner
		{
			void m2()
			{
				System.out.println("inside local inner m2()");
			}
		}
		LocalInner li = new LocalInner();
		li.m2();
		
	}

	public static void main(String[] args) {

		LocalInnerClass lic =new LocalInnerClass();
		lic.m1();
	}

}
