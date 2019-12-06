package exceptions;

public class ExceptionsAssignment 
{

	public static void main(String[] args)
	{
        try 
        {
			Thread.sleep(2000);
		} 
        catch (InterruptedException e)
        {
			throw new MyThreadException("Interrupted");
		}
        System.out.println("sleep");
	}
}
