package superkeyword;

public class Child extends Parent
{
	int c,d;
	 public Child(int a,int b,int c,int d)
	 { 
		super(a,b);
		this.c=c;
		this.d=d;
	 }
	 
	 void displayDetails()
	 {
		 System.out.println("parent :" +super.a);
		 System.out.println("parent :" +super.b);
		 System.out.println("child "+c);
		 System.out.println("child "+d);
	 }
  void parent()
  {
	  super.parent();
	  System.out.println("inside child");
  }
}
