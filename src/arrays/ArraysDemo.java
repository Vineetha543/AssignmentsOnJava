package arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	//	int arr[5];
	//	int arr[] = { 10, 20, 30, 40, 50 };
		  int arr[] = new int[5];
		  
		  arr[0]=10;
		  
		  arr[1] = new Integer(20);  //auto boxing
		  
		  arr[2]=30;
		  
		  
		  
		  System.out.println("Elements in the array");
		  
		  for(int element:arr)
		  {
			  System.out.println(element);
		  }
		   
		
	}

}
