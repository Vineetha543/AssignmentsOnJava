package internationalozation;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		
		Date d =new Date();
		DateFormat usdf = DateFormat.getDateInstance(0,Locale.US);
		DateFormat ukdf = DateFormat.getDateInstance(0,Locale.UK);
		
		
        System.out.println("Date in US format : " + usdf.format(d));
        System.out.println("Date in UK format : " + ukdf.format(d));
        
        DateFormat timeInstance = DateFormat.getTimeInstance();
        
        System.out.println(timeInstance.format(d));
        
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 0);
        
        System.out.println(dateTimeInstance.format(d));
        
	}

}
