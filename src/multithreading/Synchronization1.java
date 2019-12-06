package multithreading;

public class Synchronization1 {
	public synchronized void sayHello(String name) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("how are you " + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}
