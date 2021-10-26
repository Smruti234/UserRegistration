package RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
	public String inputMethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String string = scanner.nextLine();
		return string;
	}
	public static void main(String[] args) {
		FirstName user = new FirstName();
		final String REGEX_FIRSTNAME = "([A-Z][a-zA-Z]{2,})";
		final String REGEX_LASTNAME = "([A-Z][a-zA-Z]{2,})";
		System.out.println("Validation for First name :" + Pattern.matches(REGEX_FIRSTNAME, user.inputMethod()));
		System.out.println("Validation for Last Name :" + Pattern.matches(REGEX_LASTNAME, user.inputMethod()));
	}
}
		
		