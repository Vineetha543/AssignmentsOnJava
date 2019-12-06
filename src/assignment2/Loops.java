package assignment2;

import java.util.Scanner;

public class Loops 
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter x value");
		int x = sc.nextInt();
		for(int i=1;i<x ;i++)
		{
			if(i%10==0)
			{
				continue;
			}
			else if(i >100)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
	  }
   }
} 
