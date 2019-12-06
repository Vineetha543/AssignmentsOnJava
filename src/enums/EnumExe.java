package enums;

public class EnumExe {

	public static void main(String[] args) {

		PaymentType pt = PaymentType.CREDITCARD;
		System.out.println(pt);
		
		PaymentType[] paymentsTypes = PaymentType.values();
		for (PaymentType paymentType : paymentsTypes) {
			System.out.println(paymentType);
			System.out.println(paymentType.ordinal());
			System.out.println(paymentType.getFee());
			
		}
	}

}
