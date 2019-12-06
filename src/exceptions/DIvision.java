package exceptions;

import java.util.Scanner;

public class DIvision
{
   public static void main(String[] args)
   {
	 int a,b,c;
	 try
	 {
	 System.out.println("enter two nums");
	 Scanner sc = new Scanner(System.in);  
	 a = sc.nextInt();
	 b = sc.nextInt();
	 c=a/b;
	 System.out.println(c);
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("do not enter 0 ");
	 }
	 finally
	 {
		 System.out.println("finally block");
	 }
	 System.out.println("more code can go here");
   }
}
