package exceptions;

public class MultipleCatch 
{

	public static void main(String[] args)
	{
		try
		{
		  String input = args[0];
          System.out.println("input :"+input);
          int output = Integer.parseInt(input);
          System.out.println("output :" +output);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("input is required");
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid input");
		}
          
          System.out.println("more code can go here");
          
    }

}
