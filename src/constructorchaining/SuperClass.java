package constructorchaining;

public class SuperClass 
{
  int x;
  
  public SuperClass()
  {
	  System.out.println("no arg super class");
  }
  public SuperClass(int x)
  {
	  this();
	  this.x=x;
	  System.out.println("one arg super class");
  }
}
