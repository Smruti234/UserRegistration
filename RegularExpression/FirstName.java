package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	public String inputMethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String string = scanner.nextLine();
		return string;
	}

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		final String REGEX_FIRSTNAME = "([A-Z][a-zA-Z]{2,})";
		Pattern fName = Pattern.compile(REGEX_FIRSTNAME);
		Matcher matchForFName = fName.matcher(user.inputMethod());
		System.out.println("Your name is Valid : " + matchForFName.matches());
	}
}
