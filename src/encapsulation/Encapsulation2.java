package encapsulation;

public class Encapsulation2
{
   public static void main(String[] args)
   {
	   Patient p = new Patient();
	   p.setId(123);
	   p.setName("tom");
	   p.setSsn("heart");
	   
	   System.out.println("id :" + p.getId());
	   System.out.println("name :" + p.getName());
	   System.out.println("ssn :" + p.getSsn());
   }
}
