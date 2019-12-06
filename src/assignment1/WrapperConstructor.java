package assignment1;

public class WrapperConstructor
{

	public static void main(String[] args) 
	{
        long i = 1999;
         
        Long m = new Long(i);
         
        System.out.println(m);
        
        String s = "6483";
        
        Long n = new Long(s);  
        
        System.out.println(n);
	}

}
