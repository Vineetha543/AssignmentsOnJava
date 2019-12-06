package java8features;

public class AnonymousExe {
	public static void main(String[] args) {

		
		Thread t =new Thread(()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("child thread");
			}
		});
		t.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}

}
