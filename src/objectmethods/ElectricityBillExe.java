package objectmethods;

public class ElectricityBillExe {

	public static void main(String[] args) 
	{
       ElectricityBill eb = new ElectricityBill();
       eb.setMeter(123);
       eb.setName("vineetha");
       eb.setAddress("machavaram");
       
       ElectricityBill eb2 = new ElectricityBill();
       eb2.setMeter(123);
       eb2.setName("chinni");
       eb2.setAddress("hyderabad");
       
       System.out.println(eb.getMeter());
       System.out.println(eb.getName());
       System.out.println(eb.getAddress());
       
       System.out.println(eb.equals(eb2));
	}

}
