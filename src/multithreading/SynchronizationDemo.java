package multithreading;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Synchronization1 s = new Synchronization1();

		Synchronization2 s1 = new Synchronization2(s, "tom");
		Synchronization2 s2 = new Synchronization2(s, "joe");

		s1.start();
		s2.start(); 
	}

}
