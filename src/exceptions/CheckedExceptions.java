package exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptions {

	void readFile() throws FileNotFoundException
	{
       FileInputStream fis = new FileInputStream("");
	}
	public static void main(String[] args)
	{
		CheckedExceptions ce = new CheckedExceptions();
		try
		{
			ce.readFile();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("file not found");
		}
	}

}
