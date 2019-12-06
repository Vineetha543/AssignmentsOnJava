package exceptions;

public class Assert
{
  public static void main(String[] args) 
  {
	int withDrawl = 100;
	int currentBalance = 60;
	 
	assert(withDrawl < currentBalance):"withdrawl amount is more than current balance";
	  }
}
	