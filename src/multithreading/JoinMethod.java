package multithreading;

import java.util.Scanner;

public class JoinMethod extends Thread
{
	static int n,sum=0;
   public static void main(String[] args)
   {
	   long start = System.currentTimeMillis();
	   System.out.println("sum of first n numbers");
	   System.out.println("enter a number");
	   Scanner sc = new Scanner(System.in);   
	   JoinMethod.n = sc.nextInt();
	  
	   JoinMethod jm = new JoinMethod();
	   jm.start();
	   try
	   {
		jm.join();
	   } 
	   catch (InterruptedException e)
	   {

	   }
	   System.out.println("sum of first " +JoinMethod.n + " numbers is " + JoinMethod.sum);
	   long end = System.currentTimeMillis();
	   
	   System.out.println("the total time taken " + (end-start)/1000+ " seconds ");
	   }
   
   public void run()
   {
	   for(int i =1;i<=JoinMethod.n;i++)
	   {
		   JoinMethod.sum+=i;
		   try 
		   {
			Thread.sleep(100);
	       } 
		   catch (InterruptedException e) 
		   {
			
		   }
	   }
   }
}
