package executorframework;

public class CheckProcessor implements Runnable {
	String name;

	public CheckProcessor(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " check processor has began the processing " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
		System.out.println(name + "check processor had completed processing the check" + Thread.currentThread().getName());

}
	}
