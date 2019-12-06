package singlelevelinheritance;

public class SingleLevel extends Object
{  
   void m1()
   {
	   System.out.println("inside m1");
   }
   
   public static void main(String[] args)
   {
	SingleLevel s = new SingleLevel();
	s.m1();
   }
}   
