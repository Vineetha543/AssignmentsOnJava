package java8features;

public class NonStaticMethodMappingExe {
	
	public void myMethod123(int i)
	{
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		NonStaticMethodMapping m = i->System.out.println(i);
		m.myMethod(10);
		
		NonStaticMethodMappingExe nsme = new NonStaticMethodMappingExe();
		NonStaticMethodMapping nsm = nsme::myMethod123;
		nsm.myMethod(20);
		
	}

}
