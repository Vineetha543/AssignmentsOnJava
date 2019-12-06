package multithreading;

public class Synchronization2 extends Thread
{
     Synchronization1 s;
     String name;
     
     Synchronization2(Synchronization1 s,String name) 
     {
    	 this.s=s;
    	 this.name=name;
     }
     
     public void run()
     {
    	 s.sayHello(name);
     }
     
     
}
