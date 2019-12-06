package internationalozation;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {

		double d = 4987092.38989445;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(4);
		nf.setMaximumFractionDigits(6);
		
		//nf.setMaximumIntegerDigits(4);
		//nf.setMinimumIntegerDigits(2);
		System.out.println(nf.format(d));

	}

}
