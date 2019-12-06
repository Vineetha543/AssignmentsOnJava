package abstraction;

public abstract class BMW
{
    void commFunc()
    {
    	System.out.println("inside comm func");
    }
     
    abstract void accelerator();
    
    public static void main(String[] args)
    {
	 System.out.println("inside main");	
	}
}
