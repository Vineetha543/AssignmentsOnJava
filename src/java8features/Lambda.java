package java8features;

public class Lambda {

	public static void main(String[] args) 
	{
       A a = ()->System.out.println("Inside myMethod");
        a.myMethod();
	}

}
