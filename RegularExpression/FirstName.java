package RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
	boolean check = true;
	while (check) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter Your Choice for validate\n 1.FirstName\n 2.LastName\n 3.Email\n 4.MobileNumber\n 5.PassWord\n 6.Exit");
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch (choice) {
		case 1:
			final String REGEX_FIRSTNAME = "([A-Z][a-zA-Z]{2,})";
			System.out.println("enter first name :");
			String firstName = scanner.nextLine();
			System.out.println("Validation for First name :" + Pattern.matches(REGEX_FIRSTNAME, firstName));
			break;
		case 2:
			final String REGEX_LASTNAME = "([A-Z][a-zA-Z]{2,})";
			System.out.println("Enter LastName :");
			String lastName = scanner.nextLine();
			System.out.println("Validation for Last Name :" + Pattern.matches(REGEX_LASTNAME, lastName));
			break;
		case 3:
			final String REGEX_EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			System.out.println("Enter email :");
			String mail = scanner.nextLine();
			System.out.println("Validation for email :" + Pattern.matches(REGEX_EMAIL, mail));
			break;
		case 4:
			final String REGEX_MOBILE_NO = "^(\\d{2})( )([6-9]{1})(\\d{9})";
			System.out.println("Enter MobileNumber");
			String mobileNumber = scanner.nextLine();
			System.out.println("Validation for mobile number :" + Pattern.matches(REGEX_MOBILE_NO, mobileNumber));
			break;
		case 5:
			final String REGEX_PASSWORD = "^(?=.*[0-9])"
					+ "+(?=.*[a-z])(?=.*[A-Z])"
					+ "+(?=.*[@#$%^&+=][{1}])"
					+ "+(?=\\S+$).{8,}$";
			System.out.println("Enter Password");
			String passWord = scanner.nextLine();
			System.out.println("Validation for password :" + Pattern.matches(REGEX_PASSWORD, passWord));
			break;
		case 6:
			check = false;
			break;
		}
	}
}
}