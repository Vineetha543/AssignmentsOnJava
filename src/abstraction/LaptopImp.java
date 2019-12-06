package abstraction;

public class LaptopImp 
{
   public static void main(String[] args) 
   {
	  DellImp di = new DellImp();
	  di.scroll();
	  di.click();
	  
	  HpImp hi = new HpImp();
	  hi.scroll();
	  hi.click();
	  
   }
}
