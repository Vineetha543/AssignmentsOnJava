package multithreading;

public class MultiThreadingAssignment {

	public static void main(String[] args)
	{
        EvenNumbersThread et = new EvenNumbersThread();
        et.start();
        
        OddNumbersThread ot = new OddNumbersThread();
        ot.start();
	}

}
