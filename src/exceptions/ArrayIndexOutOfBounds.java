package exceptions;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args)
	{
       int arr[] = {10,20,30};
       try
       {
       for(int i=0 ; i <= arr.length ; i++)
       {
       System.out.println(arr[i]);
       }
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println("index beyond array length");
       }
       System.out.println("after array output");
	}
	void method()
	{
		System.out.println("inside method");
	}

}
