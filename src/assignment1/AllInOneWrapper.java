package assignment1;

public class AllInOneWrapper
{
  public static void main(String[] args)
  {
	int x=100;
	
	String s = Integer.toString(x);
	
	Integer i = new Integer(s);
	
	int j = i.intValue();
	
	Integer a = new Integer(j);
	
	String c  =  a.toString();
	
	 int d = Integer.parseInt(c);
	 
	 System.out.println(d);
	
	
	
	
	
  }
}
