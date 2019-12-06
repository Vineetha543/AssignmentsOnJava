package multithreading;

public class ThreadCommunicationExe {
	public static void main(String[] args) throws InterruptedException {
		ThreadCommunication tc = new ThreadCommunication();
		tc.start();
		synchronized (tc){
			System.out.println("main thread is going to wait");
			tc.wait();
			System.out.println("main thread notified");
		System.out.println(tc.total);
		}
	}
}
