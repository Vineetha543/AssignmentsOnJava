package executorframework;

public class Callable implements java.util.concurrent.Callable<Integer> {
	int num;
	Callable(int num)
	{
		this.num = num;
	}
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " is calculating the sum of all numbers up to " + num);
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
	}

}
 