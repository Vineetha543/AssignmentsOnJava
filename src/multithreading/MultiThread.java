package multithreading;

public class MultiThread extends Thread {
	public static void main(String[] args) throws InterruptedException {

		MultiThread mt = new MultiThread();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();

		MultiThread mt1 = new MultiThread();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();

		/*
		 * for(int j=1; j <= 200; j++) { System.out.print("j :" + j +"\t");
		 * Thread.sleep(1000); }
		 */
	}

	public void run() {
		
		System.out.println("thread name " + Thread.currentThread().getName());

		/*
		 * for(int i = 1;i <= 200; i++) { System.out.print("i :" + i + "\t");
		 * try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * System.out.println("child thread exiting"); } }
		 */
	}
}
