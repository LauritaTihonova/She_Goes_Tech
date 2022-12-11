package homeworks;

import java.util.Scanner;

public class HM12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine().trim();
        String reverseName = "";

        for (int i = (name.length() - 1); i>=0; i-- ) {
            reverseName = reverseName + name.charAt(i);
        }
        if (name.toLowerCase().equals(reverseName.toLowerCase())) {
            System.out.println( name.toLowerCase() + " is a palindrome");
        }
        else {
            System.out.println( name + " is not a palindrome");
        }


    }
}
