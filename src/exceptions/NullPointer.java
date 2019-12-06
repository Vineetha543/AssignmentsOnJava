package exceptions;

public class NullPointer {

	static ArrayIndexOutOfBounds a;
	
	public static void main(String[] args) 
	{
		try
		{
       NullPointer.a.method();
		}
		catch(NullPointerException  e)
		{
			System.out.println("create instance");
		}
	}

}
