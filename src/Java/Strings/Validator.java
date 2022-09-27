package Java.Strings;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "/[a-zA-Z_\\d]{8,30}/gm";
}

public class Validator {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
