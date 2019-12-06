package multithreading;

public class InterruptExe {

	public static void main(String[] args) {
             Interrupt i = new Interrupt();
             i.start();
             
             i.interrupt();
             
             System.out.println("end of main method");
             
             
	}

}
