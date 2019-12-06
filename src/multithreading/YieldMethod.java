package multithreading;

public class YieldMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("child method");
			Thread.yield();
		}
	}
}
