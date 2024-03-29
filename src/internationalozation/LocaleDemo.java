package internationalozation;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {

		
		Locale l = Locale.getDefault();
		
		System.out.println(l.getCountry()+" "+l.getLanguage());
		System.out.println(l.getDisplayCountry()+" "+l.getDisplayLanguage());
		
		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault().getDisplayCountry());
		
		String[] isoCountries = Locale.getISOCountries();
		
		for (String eachCountry : isoCountries) 
		{
		   System.out.println(eachCountry);	
		}
		
		String[] isoLanguages = Locale.getISOLanguages();
		for (String eachLanguage : isoLanguages) {
			System.out.println(eachLanguage);
			
		}
	}
	 
	

}
