package assignment1;

public class WrapperPrimAndString
{

	public static void main(String[] args) 
	{
       byte x = 100;
       String y = Byte.toString(x);
       byte z  = Byte.parseByte(y);
       System.out.println(z);
	}

}
