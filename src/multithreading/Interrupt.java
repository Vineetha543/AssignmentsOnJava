package multithreading;

public class Interrupt extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i am a lazy thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("got interrupted");
			}
		}
	}
}
