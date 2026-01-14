package Assignment2;
import java.util.*;
import java.util.regex.Pattern;

public class RegexValidationMenu {
    private static final String Mobile_REGEX = "^[6-9][0-9]{9}$";
    private static final String Email_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String Username_REGEX = "^[a-zA-Z0-9_]{5,15}$";
    private static final String Password_REGEX =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            do {
                System.out.println("\n------- Validate Regex Menu -------------");
                System.out.println("1. Validate Mobile Number");
                System.out.println("2. Validate Email ID");
                System.out.println("3. Validate Username");
                System.out.println("4. Validate Password");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter Mobile Number : ");
                        String mobile = sc.nextLine();
                        validateInput(mobile, Mobile_REGEX, "Mobile Number");
                        break;

                    case 2:
                        System.out.print("Enter Email ID: ");
                        String email = sc.nextLine();
                        validateInput(email, Email_REGEX, "Email ID");
                        break;

                    case 3:
                        System.out.print("Enter Username: ");
                        String username = sc.nextLine();
                        validateInput(username, Username_REGEX, "Username");
                        break;

                    case 4:
                        System.out.print("Enter Password: ");
                        String password = sc.nextLine();
                        validateInput(password, Password_REGEX, "Password");
                        break;

                    case 5:
                        System.out.println("Thank you! Exit From Program");
                        break;

                    default:
                        System.out.println("Invalid choice! Please select between 1–5.");
                }

            } while (choice != 5);

        } catch (Exception e) {
            System.out.println("Error: Invalid input type.");
        } finally {
            sc.close();
        }
    }


    private static void validateInput(String input, String regex, String type) {
        if (Pattern.matches(regex, input)) {
            System.out.println("Valid " + type);
            System.out.println("Welcome! Your " + type + " is accepted.");
        } else {
            System.out.println("Invalid " + type + ". Please try again.");
        }
    }
}
