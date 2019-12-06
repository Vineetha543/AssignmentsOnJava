package polymorphism;

public class RunTimeBinding {

	public static void main(String[] args) 
	{
       AppleLaptop m1 = new MacBookPro();
       AppleLaptop m2 = new MacBookAir();
       
       m1.start();
       m1.shutDown();
       
       m2.start();
       m2.shutDown();
	}

}
