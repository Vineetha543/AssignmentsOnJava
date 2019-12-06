package multithreading;

public class YieldExe {
	public static void main(String[] args) {

		YieldMethod ye = new YieldMethod();
		ye.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread");
		}
	}
}
 