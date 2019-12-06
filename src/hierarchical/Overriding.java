package hierarchical;

public class Overriding
{
  public static void main(String[] args)
  {
	Car c = new Car();
	System.out.println(c.fuel());
	Bike b = new Bike();
	System.out.println(b.fuel());
	
  }
}
