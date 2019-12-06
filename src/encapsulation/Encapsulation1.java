package encapsulation;

public class Encapsulation1 
{
    public static void main(String[] args)
    {
		Customer c = new Customer();
		c.setFirstName("vineetha");
		c.setLastName("pidugu");
		c.setCreditCard("12345");
		
		System.out.println("first name :" + c.getFirstName());
		System.out.println("last name :" + c.getLastName());
		System.out.println("credit card :" + c.getCreditCard());
		
		
	}

	}

