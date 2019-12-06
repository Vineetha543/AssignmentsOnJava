package polymorphism;

public class MacBookAir extends MacBook
{
	 @Override
	public void start()
	     {
	        System.out.println("inside macbookair start");
	     }
	     public void shutDown()
	     {
	    	 System.out.println("inside macbookair shutdown");
	     }
}
