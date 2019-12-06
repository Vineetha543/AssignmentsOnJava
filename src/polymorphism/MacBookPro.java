package polymorphism;	

public class MacBookPro extends MacBook
{
     @Override
	public void start()
     {
        System.out.println("inside macbookpro start");
     }
     public void shutDown()
     {
    	 System.out.println("inside macbookpro shutdown");
     }
}
