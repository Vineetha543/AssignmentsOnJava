package constructorchaining;

public class ChildClass extends SuperClass
{
  public ChildClass()
  {
	  this(10);
	  System.out.println("no args child class");
  }
  public ChildClass(int x)
  {
	  super(x);
	  System.out.println("one arg child class");
  }
  public static void main(String[] args)
  {
	ChildClass c = new ChildClass();
	
  }
}
  