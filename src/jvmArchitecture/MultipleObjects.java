package jvmArchitecture;

public class MultipleObjects {

	public static void main(String[] args) 
	{
        Class1 cl1 = new Class1();
        Class c1 = cl1.getClass();
        
        Class1 cl2 = new Class1();
        Class c2 = cl2.getClass();
        
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1 == c2);
        
        System.out.println(c1.getClassLoader());
        System.out.println(String.class.getClassLoader());
        
        
	}

}
