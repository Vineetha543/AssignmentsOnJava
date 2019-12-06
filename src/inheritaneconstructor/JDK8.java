package inheritaneconstructor;

public class JDK8 extends JDK7
{
	public JDK8()
	{
		System.out.println("JDK8");
	}
   public static void main(String[] args)
   {
	  JDK8 jdk = new JDK8();
   }
}
