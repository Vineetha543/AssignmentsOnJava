package assignment2;

public class IfElse2 
{
    public static void main(String[] args)
    {
	    int m=56;
	    int p=39;
	    int c=67;
	    
	    if(m< 35 || p<35 || c<35)
	    {
	    	System.out.println("student failed");
	    }
	    else
	    {
	    	float avg=(m+p+c)/3;
	    	if(avg <=59)
	    	{
	    		System.out.println("C grade");
	    	}
	    	else if(avg <=69)
	    	{
	    		System.out.println("B grade");
	    	}
	    	else
	    	{
	    		System.out.println("A grade");
	    	}
	    }
    }
}
  