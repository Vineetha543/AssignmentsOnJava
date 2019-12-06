package multithreading;

public class ThreadCommunication extends Thread {
	int total;
	public void run() {
      System.out.println("child thread is calculating the sum");
      synchronized (this) {
      for(int i=1;i<=100;i++)
      {
    	  total+=i;
      }
      this.notify();
      }
	}
}
