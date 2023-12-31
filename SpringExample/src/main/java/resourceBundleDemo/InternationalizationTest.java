package resourceBundleDemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationTest {
	public static void main(String[] args) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("TestBundle");
		displayValues(resourceBundle);
		Locale defaultLocale = Locale.getDefault();
		ResourceBundle bundle2 = ResourceBundle.getBundle("TestBundle", defaultLocale);
		displayValues(bundle2);
		Locale swedishLocale = new Locale("sv", "SE");
		ResourceBundle bundle3 = ResourceBundle.getBundle("TestBundle", swedishLocale);
		displayValues(bundle3);
		Locale nonexistentLocale = new Locale("xx", "XX");
		ResourceBundle bundle4 = ResourceBundle.getBundle("TestBundle", nonexistentLocale);
		displayValues(bundle4);
	}

	private static void displayValues(ResourceBundle resourceBundle) {
		System.out.println("hello message:" + resourceBundle.getString("my.hello"));
		System.out.println("goodbye message:" + resourceBundle.getString("my.goodbye"));
		System.out.println("question message:" + resourceBundle.getString("my.question"));
		System.out.println();
	}
}
