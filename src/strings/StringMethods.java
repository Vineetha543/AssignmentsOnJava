package strings;

public class StringMethods
{
   public static void main(String[] args)
   {
	  String s = "Hello World";
	  
	  System.out.println("length of the string is: " + s.length());
	  System.out.println("index of : " + s.indexOf('o'));
	  System.out.println("Character at :  " + s.charAt(2));
	  System.out.println("substring with begginning index : " + s.substring(2));
	  System.out.println("substring with begginning and ending index : " + s.substring(0,4));
	  
	  String[] result = s.split(" ");
	  for(int i=0;i<result.length;i++)
	  System.out.println(result[i]);
	  
	  System.out.println("Replace :" + s.replace('l','m'));
	  System.out.println("To uppercase : " + s.toUpperCase());
	  System.out.println("To lowercase : " + s.toLowerCase());
   }
}
 