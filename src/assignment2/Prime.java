package assignment2;

public class Prime {

	public static void main(String[] args)
	{
        int x=10
        		;
        int factor=0;
      for(int i=1;i<=x;i++)
      {
        	if(x%i==0)
        	{
        		factor++;
        	}
    	}
        
        if(factor==2)
        {
        	System.out.println("prime");
        }
        else
        {
        	System.out.println("not prime");
        }
	}

}
