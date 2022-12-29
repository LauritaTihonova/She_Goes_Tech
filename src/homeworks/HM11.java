package homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HM11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
           System.out.println("Please enter your personal number: ");
            String personalNumber = scanner.nextLine();

            Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
            Matcher matcher = pattern.matcher(personalNumber);
            boolean validPersonalNumber = matcher.matches();
            if (validPersonalNumber) {
                System.out.println("Your inputted personal code is valid");
            } else {
                System.out.println("Your inputted personal code is not valid");
            }

            System.out.println("Do you want to check your personal number again? y/n ");
            answer = scanner.nextLine();

        } while (!answer.equals("n"));

    }
}
