package assignment2;

public class LabelledBlock {

	public static void main(String[] args) 
	{
        int x =20;
        
        L1:
        {
        	System.out.println("inside block");
        	if(x==20)
        	{
        		break L1;
        	}
        	System.out.println("block ends");
        }
        System.out.println("outside block");
	} 

}
