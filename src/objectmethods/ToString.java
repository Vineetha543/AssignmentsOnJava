package objectmethods;

public class ToString {

	public static void main(String[] args)
	{
		
		
       Passenger p = new Passenger();
       p.setFirstName("vineetha");
       p.setLastName("pidugu");
       p.setId(123);
       
       Passenger p2 = new Passenger();
       p2.setFirstName("vineetha");
       p2.setLastName("pidugu");
       p2.setId(123);
       
       
       System.out.println(p.equals(p2));
       
	}

}
