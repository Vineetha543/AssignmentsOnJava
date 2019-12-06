package assignment1;

public class StaticAndNonStatic
{
	static
	{
		System.out.println("Inside static");
	}
	{
		System.out.println("Inside non-static");
	}

	public static void main(String[] args)
	{
         System.out.println("Inside main");
         StaticAndNonStatic sb = new StaticAndNonStatic();
	}

}
