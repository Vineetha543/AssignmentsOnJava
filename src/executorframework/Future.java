package executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Future {

	public static void main(String[] args) {
		Callable[] c = { new Callable(10), new Callable(20), new Callable(30), new Callable(40), new Callable(50),
				new Callable(60) };
		ExecutorService service = Executors.newFixedThreadPool(3);

		for (Callable callable : c) {
			java.util.concurrent.Future<Integer> future = service.submit(callable);
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();

	}

}
