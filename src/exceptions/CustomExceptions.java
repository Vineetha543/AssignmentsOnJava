package exceptions;

public class CustomExceptions
{ 
    public static void main(String[] args) throws CheckedCustomExceptions
    {
		throw new UncheckedCustomExceptions("Business Exception Occured");
		//throw new CheckedCustomExceptions("Exception needs to be handled");
	}
}
