package innerclasses;

public class OuterClass

{

	private static int x = 50;
	private int y;

	public OuterClass(int y)

	{
		this.y = y;
	}

	void m1() {
		System.out.println("outer class non static method");
	}

	class Inner {

		private int y;

		Inner(int y) {
			this.y = y;
		}

		private void m2() {
			System.out.println("outer classes"+OuterClass.x);
			System.out.println("outer classes"+OuterClass.this.y);
			System.out.println("inner classes"+this.y);
		}
	}

	public static void main(String[] args) {

		OuterClass s = new OuterClass(20);
		s.m1();
		OuterClass.Inner i = s.new Inner(40);
		i.m2();
		
	}
}
