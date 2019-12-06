
package polymorphism;

public class CompileTimeBinding 
{
   public static void add(int a, int b, int c)
   {
	   System.out.println(a+b+c);
   }
   public static void add(int a, float b)
   {
	   System.out.println(a+b);
   }
   public static void add(int a,int b,float c, float d)
   {
	   System.out.println(a+b+c+d);
   }
   public static void main(String[] args)
   {
	add(5,7,9);
	add(5,9.8f);
	add(6,9,9.8f,8.6f);
   }
}
