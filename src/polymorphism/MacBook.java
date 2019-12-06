package polymorphism;

public class MacBook implements AppleLaptop
{
    public void start()
    {
    	System.out.println("inside macbook start");
    }
    public void shutDown()
    {
    	System.out.println("inside macbook shutdown");
    }
}
