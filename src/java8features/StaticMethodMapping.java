package java8features;

public class StaticMethodMapping {

	
	public static void myMethod() 
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) 
	
	{ 
		Runnable r = StaticMethodMapping::myMethod;
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Parent Thread");
		}
		
	}

}
