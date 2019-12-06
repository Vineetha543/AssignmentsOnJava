package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		CheckProcessor[] cps = { new CheckProcessor("ATM"), new CheckProcessor("Bank"), new CheckProcessor("mobile"),
				new CheckProcessor("web") };
		
		 ExecutorService Service = Executors.newFixedThreadPool(2);
		 
		 for (CheckProcessor checkProcessor : cps) {
			 Service.submit(checkProcessor);
			}
		 Service.shutdown();
	}

}
