package abstraction;

public class AbstractionThroughClass {

	public static void main(String[] args)
	{
       ThreeSeries ts = new ThreeSeries();
       ts.accelerator();
       ts.commFunc();
       FiveSeries fs = new FiveSeries();
       fs.accelerator();
       fs.commFunc();   
	}

}
