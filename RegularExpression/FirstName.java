package RegularExpression;

import java.util.regex.Pattern;

public class FirstName {
	public static void main(String[] args) {
		final String REGEX_EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc@yahoo.com"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc-100@yahoo.com"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc.100@yahoo.com"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc111@abc.com"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc-100@abc.net"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc.100@abc.com.au"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc@%*.com"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc()*@gmail.com"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc@abc@gmail.com"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc@gmail.com.1a"));
		System.out.println(Pattern.matches(REGEX_EMAIL, "abc()*@gmail.com"));
	}
}