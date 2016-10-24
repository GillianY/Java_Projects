import java.util.Locale;

public class Locales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale[] locales = Locale.getAvailableLocales();
		
		
		System.out.println();
		
		for(Locale loc: locales)
		{
			
			System.out.println(loc.getCountry()+"__"+loc.getLanguage()+"___"+loc.getDisplayCountry()+"___"+loc.getDisplayLanguage()+"___"+loc.getDisplayName());
			
		}
		
	}

}
