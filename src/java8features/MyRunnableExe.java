package java8features;

public class MyRunnableExe {

	public static void main(String[] args) {

		//Runnable r = new MyRunnable();
		//Thread t = new 	Thread(r);
		//t.start();
		
		Runnable r = ()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("child tthread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}

}
